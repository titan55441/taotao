package cn.itcast.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Batman on 16/8/23.
 */
@RequestMapping("page")
@Controller
public class PageController {

    @RequestMapping(value = "{pageName}",method = RequestMethod.GET)
    public String toPage(@PathVariable("pageName") String pageName){
        return pageName;
    }

}
