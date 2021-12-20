package com.kesen.ssm.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kesen.ssm.entity.Users;
import com.kesen.ssm.mapper.UsersMapper;
import com.kesen.ssm.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @className: com.kesen.ssm.service.impl-> UserserviceImpl
 * @description:
 * @author: kesen
 * @createDate: 2021-12-20 10:15
 * @version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUserService {
}
