package com.example.nacosdemo.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yhli
 */
@Data
@TableName("user")
public class user {

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Long age;

}
