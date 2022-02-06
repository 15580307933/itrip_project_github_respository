package com.cskt.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cskt.common.constants.ErrorCodeEnum;
import com.cskt.common.exception.ServiceException;
import com.cskt.entity.ItripUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 15312
 */

public interface ItripUserService extends IService<ItripUser>{

//    boolean userRegister(UserRegisterCondition condition);


    @Override
    List<ItripUser> list(Wrapper<ItripUser> queryWrapper);
}
