package cn.itcast.mybatis.service;

import cn.itcast.mybatis.bean.EasyUIResult;
import cn.itcast.mybatis.mapper.UserMapper;
import cn.itcast.mybatis.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

        PageHelper.startPage(page,rows);
        List<User> users = this.userMapper.queryUserList();

        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return  new EasyUIResult(pageInfo.getTotal(),pageInfo.getList());
    }
}
