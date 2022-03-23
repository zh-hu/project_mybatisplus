package com.atguigu.mybatisplus.pojo;

import com.atguigu.mybatisplus.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

/**
 * @author zhanghu
 * @create 2022-03-22 12:24
 */

@Data
public class User {
    /**
     *  @TableId：将属性所对应的字段指定为字段
     *      value属性用于指定主键的字段
     *      type属性设置主键生成策略
     *      (value = "uid",type = IdType.AUTO )
     */

    @TableId("uid")
    private Long id;

    /**
     * 指定属性所对应的字段名
     */
    @TableField("user_name")
    private String name;

    private Integer age;

    private String email;

    private SexEnum sex;

    @TableLogic
    private Integer isDeleted;

}
