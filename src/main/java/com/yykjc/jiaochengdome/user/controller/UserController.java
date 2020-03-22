package com.yykjc.jiaochengdome.user.controller;

import com.yykjc.jiaochengdome.user.entity.UserEntity;
import com.yykjc.jiaochengdome.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户user〉
 *
 * @author Administrator
 * @create 2020/3/21 0021
 * @since 1.0.0
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {
        List<UserEntity> all = userService.getAll(map);
        return all;
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        return "redirect:/index.html";
    }

    @ResponseBody
    @RequestMapping("/save")
    public String save(@RequestBody UserEntity userEntity) {
        userService.save(userEntity);
        return "success";
    }
}
