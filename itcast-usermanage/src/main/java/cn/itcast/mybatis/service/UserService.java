package cn.itcast.mybatis.service;

import cn.itcast.mybatis.bean.EasyUIResult;
import cn.itcast.mybatis.mapper.UserMapper;
import cn.itcast.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Batman on 16/8/23.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public EasyUIResult queryUserList(Integer page, Integer rows) {

        List<User> users = this.userMapper.queryUserList();

        return  new EasyUIResult(30L,users);
    }
}
