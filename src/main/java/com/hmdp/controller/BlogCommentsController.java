package com.hmdp.controller;


import com.hmdp.entity.frequency;
import com.hmdp.service.impl.frequencyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/comments")
public class BlogCommentsController {

    @Autowired
    private frequencyImpl frequency;
//通过变频器名称查询
    @GetMapping("/selectname")
    @ResponseBody
    public frequency selectemployee(String name){
       return  frequency.select(name);
    }
    //查询状态
    @GetMapping("/status")
    public byte selectstatus(int id){
        return frequency.status(id);
    }
    @GetMapping("/activate")
    //启动或停止
    public boolean activate(int id){
        return frequency.activateId(id);
     }
     //频率修改
    @PostMapping("/setfrequency")
    public boolean setfrequency(@RequestBody frequency frequencyes){
      return   frequency.setfrequency(frequencyes);
    }
    
}
