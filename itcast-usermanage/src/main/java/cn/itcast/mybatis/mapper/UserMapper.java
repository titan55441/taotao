package cn.itcast.mybatis.mapper;

import cn.itcast.mybatis.pojo.User;

import java.util.List;

/**
 * Created by Batman on 16/8/23.
 */
public interface UserMapper {
    List<User> queryUserList();
}
