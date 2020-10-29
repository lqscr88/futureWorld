package org.lqscr88.web.controller;

import com.baomidou.mybatisplus.plugins.Page;
import org.lqscr88.domain.Mount;
import org.lqscr88.query.MountQuery;
import org.lqscr88.service.IMountService;
import org.lqscr88.utils.AjaxResult;
import org.lqscr88.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mount")
public class MountController {
    @Autowired
    public IMountService mountService;

    /**
    * 保存和修改公用的
    * @param mount  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Mount mount){
        try {
            if(mount.getId()!=null){
                mountService.updateById(mount);
            }else{
                mountService.insert(mount);
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
            mountService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Mount get(@PathVariable("id")Long id)
    {
        return mountService.selectById(id);
    }


    /**
    * 查看所有的员工信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Mount> list(){

        return mountService.selectList(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/pagelist",method = RequestMethod.POST)
    public PageList<Mount> json(@RequestBody MountQuery query)
    {
        Page<Mount> page = new Page<Mount>(query.getPage(),query.getRows());
        page = mountService.selectPage(page);
        return new PageList<Mount>(page.getTotal(),page.getRecords());
    }
}
