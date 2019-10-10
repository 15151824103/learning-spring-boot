package com.ht.controller;

import com.ht.entity.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//相当于@Controller + @ResponseBody，此注解打在类上，可以替代@ResponseBody注解，这样就不需要每个方法都打@ResponseBody注解了
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Users hello() {
        return new Users(1,"贺涛",22,new Date());
    }

}
