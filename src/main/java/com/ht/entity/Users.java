package com.ht.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

//@JsonPropertyOrder(value = {"age", "name"})此注解改变类中定义的属性的顺序
//@JsonPropertyOrder(value = {"age", "name"})
public class Users {

    //此注解会在转Json时，屏蔽此属性，就是忽略掉这个字段
    @JsonIgnore
    private int id;

    //此注解可在转Json时自定义字符串，替换原属性值,就是为属性起一个别名
    @JsonProperty("xxxx")
    private String name;

    //@JsonInclude(JsonInclude.Include.NON_NULL) 此注解排除属性为空的,就是不会序列化属性值为空的.
    private int age;

    //在转Json时，添加timezone = "GMT+8",因为时区存在差异，会有8个小时的误差，所有加上8即可
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Users() {
    }

    public Users(int id, String name, int age, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
