package org.lqscr88.web.controller;

import com.baomidou.mybatisplus.plugins.Page;
import org.lqscr88.domain.Treasure;
import org.lqscr88.query.TreasureQuery;
import org.lqscr88.service.ITreasureService;
import org.lqscr88.utils.AjaxResult;
import org.lqscr88.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treasure")
public class TreasureController {
    @Autowired
    public ITreasureService treasureService;

    /**
    * 保存和修改公用的
    * @param treasure  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Treasure treasure){
        try {
            if(treasure.getId()!=null){
                treasureService.updateById(treasure);
            }else{
                treasureService.insert(treasure);
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
            treasureService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Treasure get(@PathVariable("id")Long id)
    {
        return treasureService.selectById(id);
    }


    /**
    * 查看所有的员工信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Treasure> list(){

        return treasureService.selectList(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/pagelist",method = RequestMethod.POST)
    public PageList<Treasure> json(@RequestBody TreasureQuery query)
    {
        Page<Treasure> page = new Page<Treasure>(query.getPage(),query.getRows());
        page = treasureService.selectPage(page);
        return new PageList<Treasure>(page.getTotal(),page.getRecords());
    }
}
