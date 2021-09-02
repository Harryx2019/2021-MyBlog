package com.myblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Author: Harry.XiaHongjie
 * @Date: 2021/9/2 18:26
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
}
