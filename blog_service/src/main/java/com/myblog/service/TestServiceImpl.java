package com.myblog.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myblog.api.TestService;
import com.myblog.entity.User;
import com.myblog.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Harry.XiaHongjie
 * @Date: 2021/8/14 0:13
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    public TestMapper testMapper;

    @Override
    public User getUserById(Integer id) {
        //testMapper.
        return testMapper.getUserById(id);
    }

    @Override
    public String test() {
        return "helloWorld";
    }
}
