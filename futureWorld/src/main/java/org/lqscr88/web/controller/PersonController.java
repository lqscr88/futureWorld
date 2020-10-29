package org.lqscr88.web.controller;

import com.baomidou.mybatisplus.plugins.Page;
import org.lqscr88.domain.Person;
import org.lqscr88.query.PersonQuery;
import org.lqscr88.service.IPersonService;
import org.lqscr88.utils.AjaxResult;
import org.lqscr88.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    public IPersonService personService;

    /**
    * 保存和修改公用的
    * @param person  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Person person){
        try {
            if(person.getId()!=null){
                personService.updateById(person);
            }else{
                personService.insert(person);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存对象失败！"+e.getMessage());
        }
    }

    /**
    * 删除对象信息
    * @param id
    * @return
    */
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Long id){
        try {
            personService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Person get(@PathVariable("id")Long id)
    {
        return personService.selectById(id);
    }


    /**
    * 查看所有的员工信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Person> list(){

        return personService.selectList(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/pagelist",method = RequestMethod.POST)
    public PageList<Person> json(@RequestBody PersonQuery query)
    {
        Page<Person> page = new Page<Person>(query.getPage(),query.getRows());
        page = personService.selectPage(page);
        return new PageList<Person>(page.getTotal(),page.getRecords());
    }

    /**
     * 分页查询数据
     *
     * @param person 人物对象
     */
    @RequestMapping(value = "/beReborn",method = RequestMethod.POST)
    public AjaxResult beReborn(@RequestBody Person person)
    {
        personService.insertByPerson(person);
        return AjaxResult.me();
    }
}
