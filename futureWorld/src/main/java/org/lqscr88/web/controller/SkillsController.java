package org.lqscr88.web.controller;

import com.baomidou.mybatisplus.plugins.Page;
import org.lqscr88.domain.Skills;
import org.lqscr88.query.SkillsQuery;
import org.lqscr88.service.ISkillsService;
import org.lqscr88.utils.AjaxResult;
import org.lqscr88.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    public ISkillsService skillsService;

    /**
    * 保存和修改公用的
    * @param skills  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Skills skills){
        try {
            if(skills.getId()!=null){
                skillsService.updateById(skills);
            }else{
                skillsService.insert(skills);
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
            skillsService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Skills get(@PathVariable("id")Long id)
    {
        return skillsService.selectById(id);
    }


    /**
    * 查看所有的员工信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Skills> list(){

        return skillsService.selectList(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/pagelist",method = RequestMethod.POST)
    public PageList<Skills> json(@RequestBody SkillsQuery query)
    {
        Page<Skills> page = new Page<Skills>(query.getPage(),query.getRows());
        page = skillsService.selectPage(page);
        return new PageList<Skills>(page.getTotal(),page.getRecords());
    }
}
