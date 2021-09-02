package com.myblog.mapper;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myblog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Harry.XiaHongjie
 * @Date: 2021/9/2 18:32
 */
@Mapper
public interface TestMapper extends IService {
    User getUserById(@Param("id") Integer id);
}
