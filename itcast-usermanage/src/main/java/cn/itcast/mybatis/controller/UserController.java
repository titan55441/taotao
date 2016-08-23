package cn.itcast.mybatis.controller;

import cn.itcast.mybatis.bean.EasyUIResult;
import cn.itcast.mybatis.pojo.User;
import cn.itcast.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Batman on 16/8/23.
 */
@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public EasyUIResult queryUserList(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                      @RequestParam(value = "rows",defaultValue = "5") Integer rows){
        return  this.userService.queryUserList(page,rows);

    }
}

