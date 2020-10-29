package org.lqscr88.web.controller;

import com.baomidou.mybatisplus.plugins.Page;
import org.lqscr88.domain.Family;
import org.lqscr88.query.FamilyQuery;
import org.lqscr88.service.IFamilyService;
import org.lqscr88.utils.AjaxResult;
import org.lqscr88.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/family")
public class FamilyController {
    @Autowired
    public IFamilyService familyService;

    /**
    * 保存和修改公用的
    * @param family  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Family family){
        try {
            if(family.getId()!=null){
                familyService.updateById(family);
            }else{
                familyService.insert(family);
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
            familyService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Family get(@PathVariable("id")Long id)
    {
        return familyService.selectById(id);
    }


    /**
    * 查看所有的员工信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Family> list(){

        return familyService.selectList(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/pagelist",method = RequestMethod.POST)
    public PageList<Family> json(@RequestBody FamilyQuery query)
    {
        Page<Family> page = new Page<Family>(query.getPage(),query.getRows());
        page = familyService.selectPage(page);
        return new PageList<Family>(page.getTotal(),page.getRecords());
    }
}
