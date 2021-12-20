package com.kesen.ssm.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * @className: com.kesen.demp.springbootdemo.entity-> User
 * @description:
 * @author: kesen
 * @createDate: 2021-12-16 18:01
 * @version: 1.0
 */
@TableName(value = "CYBERAUDIT_CONF.USERS")
public class Users {

    @TableId(type= IdType.AUTO)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
