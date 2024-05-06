package com.hmdp.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


import com.hmdp.entity.frequency;
import com.hmdp.service.frequencyService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
@Service
public class frequencyImpl  implements frequencyService {

  @Autowired
    private com.hmdp.mapper.frequencyMapper frequencyMapper;

  public frequency select(String name){
    QueryWrapper<frequency> queryWrapper=new QueryWrapper<>();
    queryWrapper.eq("name",name);
    frequency frequency = frequencyMapper.selectOne(queryWrapper);
    return frequency;
  }

  public  void  maps(){
    List<frequency> frequencies = frequencyMapper.selectList(null);
    System.err.println(frequencies.size());
  }

  public boolean activateId(int id){
    byte i=0;
    frequency frequency = frequencyMapper.selectById(id);
    if(  frequency.getInitiate()==0){
      i=1;
    }
    frequency.setInitiate(i);
    int status = frequencyMapper.updateById(frequency);
    if(status>0){
      return true;
    }
    return  false;
  }

  //
  public byte status(int id){
    return frequencyMapper.selectById(id).getInitiate();
  }

  public boolean setfrequency(frequency frequency){
    com.hmdp.entity.frequency frequency1 = frequencyMapper.selectById(frequency.getId());
    if(frequency1==null){
      return false;
    }
    frequency1.setFrequency(frequency.getFrequency());
    int i = frequencyMapper.updateById(frequency1);
    if(i>0){
      return true;
    }
    return false;
  }

}
