package com.kesen.ssm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.kesen.ssm.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @className: com.kesen.demp.springbootdemo.mapper-> UsersMapper
 * @description:
 * @author: kesen
 * @createDate: 2021-12-17 16:07
 * @version: 1.0
 */
@Repository
public interface UsersMapper extends BaseMapper<Users> {
    List<Users> findAllUser();
}
