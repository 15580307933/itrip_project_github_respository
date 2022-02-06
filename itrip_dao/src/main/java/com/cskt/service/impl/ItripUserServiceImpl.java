package com.cskt.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cskt.service.ItripUserService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.entity.ItripUser;
import com.cskt.mapper.ItripUserMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 15312
 */
@Service

public class ItripUserServiceImpl extends ServiceImpl<ItripUserMapper, ItripUser> implements ItripUserService {


    @Override
    public List<ItripUser> list(Wrapper<ItripUser> queryWrapper){

        List<ItripUser> userLists = new ArrayList<>();
        return userLists;
    }
}
