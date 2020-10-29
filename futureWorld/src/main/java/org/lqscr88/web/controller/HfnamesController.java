package org.lqscr88.web.controller;

import org.lqscr88.service.IHfnamesService;
import org.lqscr88.domain.Hfnames;
import org.lqscr88.query.HfnamesQuery;
import org.lqscr88.utils.AjaxResult;
import org.lqscr88.utils.PageList;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hfnames")
public class HfnamesController {
    @Autowired
    public IHfnamesService hfnamesService;

    /**
    * 保存和修改公用的
    * @param hfnames  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Hfnames hfnames){
        try {
            if(hfnames.getId()!=null){
                hfnamesService.updateById(hfnames);
            }else{
                hfnamesService.insert(hfnames);
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
            hfnamesService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Hfnames get(@PathVariable("id")Long id)
    {
        return hfnamesService.selectById(id);
    }


    /**
    * 查看所有的员工信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Hfnames> list(){

        return hfnamesService.selectList(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/pagelist",method = RequestMethod.POST)
    public PageList<Hfnames> json(@RequestBody HfnamesQuery query)
    {
        Page<Hfnames> page = new Page<Hfnames>(query.getPage(),query.getRows());
        page = hfnamesService.selectPage(page);
        return new PageList<Hfnames>(page.getTotal(),page.getRecords());
    }
}
