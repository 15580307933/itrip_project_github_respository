package com.cskt.itripauth.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.cskt.common.constants.ErrorCodeEnum;
import com.cskt.common.vo.ReturnResult;
import com.cskt.entity.ItripUser;
import com.cskt.service.ItripUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @Author 刘涛
 * @Date: 2022/01/27/ 14:44
 * @Description User用户相关控制器
 */

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Resource
    private ItripUserService userService;

    @GetMapping(value = "/ckusr")
    @ApiOperation(value = "验证用户是否存在")
    public ReturnResult checkUser(@ApiParam(value = "被验证的用户名") String name) {
        if (!StringUtils.hasLength(name)) {
            //参数为空
            return ReturnResult.error(ErrorCodeEnum.AUTH_PARAMETER_IS_EMPTY);
        }
        QueryWrapper<ItripUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_code", name);
        ItripUser user = userService.getOne(queryWrapper);
        if (user != null) {
            //当用户数据不为空的时候，校验不通过
            return ReturnResult.error(ErrorCodeEnum.AUTH_USER_ALREADY_EXISTS);
        }
        if (user == null) {
            return ReturnResult.error(ErrorCodeEnum.AUTH_UNKNOWN);
        }
        return ReturnResult.ok();
    }



}
