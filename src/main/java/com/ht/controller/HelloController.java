package com.ht.controller;

import com.ht.entity.Family;
import com.ht.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

//相当于@Controller + @ResponseBody，此注解打在类上，可以替代@ResponseBody注解，这样就不需要每个方法都打@ResponseBody注解了
@RestController
public class HelloController {

    @Autowired
    private Family family;

    @RequestMapping("/hello")
    public Users hello() {
        return new Users(1,"贺涛",22, new Date());
    }

    /*
      method = RequestMethod.DELETE,采用了RESTFul风格开发.路径下的/{id}是删除所需的id在地址栏加上id,
      方法内即可通过@PathVariable注解获取到
      @DeleteMapping,可以替代@RequestMapping + method = RequestMethod.DELETE
      @PathVariable注解 表示获取路径上的id,就是地址可以写成 /users/1,形参id就是 1 了
    */
    //@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/users/{id}")
    public int del(@PathVariable int id) {
        System.out.println(id);
        return id;
    }

    /*
      @RequestParam注解:可接收页面的值,如表单提交的值.只要变量的值和表单(或地址中的变量名)的name值一致,可有省略不写
      @RequestBody注解:可接收页面复杂的值,如Json串,集合等
    */
    @PostMapping("/users")
    public Users add(@RequestBody Users user) {
        System.out.println(user.getName());
        return user;
    }

    @GetMapping("/family")
    public Family family() {
        return family;
    }

}
