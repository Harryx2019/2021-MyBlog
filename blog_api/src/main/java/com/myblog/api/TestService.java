package com.myblog.api;

import com.myblog.entity.User;

/**
 * @Author: Harry.XiaHongjie
 * @Date: 2021/8/14 0:10
 */
public interface TestService {
    User getUserById(Integer id);
    String test();
}
