package com.kesen.ssm.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.kesen.ssm.common.CommonResult;
import com.kesen.ssm.entity.Users;
import com.kesen.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.kesen.ssm.controller-> UserController
 * @description:
 * @author: kesen
 * @createDate: 2021-12-17 18:13
 * @version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;



    @GetMapping("/user/test")
    public CommonResult test1() {
        CommonResult commonResult = new CommonResult();

        EntityWrapper<Users> wrapper = new EntityWrapper<>();
        Users user = userService.selectOne(wrapper.eq("id", 1L));
        commonResult.setData(user);
        return commonResult;
    }
}
