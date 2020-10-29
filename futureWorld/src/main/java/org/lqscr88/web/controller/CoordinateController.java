package org.lqscr88.web.controller;

import com.baomidou.mybatisplus.plugins.Page;
import org.lqscr88.domain.Coordinate;
import org.lqscr88.query.CoordinateQuery;
import org.lqscr88.service.ICoordinateService;
import org.lqscr88.utils.AjaxResult;
import org.lqscr88.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coordinate")
public class CoordinateController {
    @Autowired
    public ICoordinateService coordinateService;

    /**
    * 保存和修改公用的
    * @param coordinate  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/save",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Coordinate coordinate){
        try {
            if(coordinate.getId()!=null){
                coordinateService.updateById(coordinate);
            }else{
                coordinateService.insert(coordinate);
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
            coordinateService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Coordinate get(@PathVariable("id")Long id)
    {
        return coordinateService.selectById(id);
    }


    /**
    * 查看所有的员工信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Coordinate> list(){

        return coordinateService.selectList(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/pagelist",method = RequestMethod.POST)
    public PageList<Coordinate> json(@RequestBody CoordinateQuery query)
    {
        Page<Coordinate> page = new Page<Coordinate>(query.getPage(),query.getRows());
        page = coordinateService.selectPage(page);
        return new PageList<Coordinate>(page.getTotal(),page.getRecords());
    }
}
