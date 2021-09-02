package com.myblog.controller;

import com.myblog.Result;
import com.myblog.ResultInfo;
import com.myblog.api.TestService;
import com.myblog.entity.User;
import com.myblog.handler.exception.MyRuntimeException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Harry.XiaHongjie
 * @Date: 2021/8/12 23:59
 */
@RestController
@Api(tags = "测试模块")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ApiOperation("测试接口")
    public Result test(){
//        String test = testService.test();
//        throw new MyRuntimeException("111","自定义异常");
//        if(!StringUtils.isEmpty(test)){
//            return Result.success().codeAndMessage(ResultInfo.SUCCESS).data("data",test);
//        }
//        return Result.error().codeAndMessage(ResultInfo.NOT_FOUND);
        User user = testService.getUserById(1);
        return Result.success().data("data",user);
    }
}
