package com.ht.entity;

import com.ht.config.OverrideDefaultPropertySourceFactoryMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


/*
* @ConfigurationProperties(prefix = "family")
*      此注解用于对类属性，批量的赋值
*      支持松散的语法绑定
*      不支持springEL，就是spring表达式
*      支持复杂类型的嵌套
*      支持JSR303数据校验
*/
@Component
@Validated    //此注解用于JSR303数据校验，加上此注解，并在属性上加上用于校验的注解即可，如 @Email,@NotNull......
@ConfigurationProperties(prefix = "family")
/*
*此注解可以加载,比如之前的旧项目的配置文件到此项目中,但默认不支持.yml的格式
*可以重写DefaultPropertySourceFactory类的createPropertySource方法,让它支持
* @PropertySource(value = {"classpath: oldyml.yml"}, factory = OverrideDefaultPropertySourceFactoryMethod.class)
* 加上factory = OverrideDefaultPropertySourceFactoryMethod.class,便可指定重写的类
*                    ===这是第一种方法 (.yml)===
*/
//@PropertySource(value = {"classpath: oldyml.yml"}, factory = OverrideDefaultPropertySourceFactoryMethod.class)
/*
*而加载.properties格式的文件则默认支持,只需指定其路径即可
*@PropertySource(value = {"classpath: oldProperties.properties"})
*                    ===这是第一种方法 (.properties)===
*/
//@PropertySource(value = {"classpath: oldProperties.properties"})
public class Family {

    /*
    * @Value("${family.family-name}")
    *       此注解用于对类属性，一个一个的赋值
    *       不支持松散的语法绑定
    *       支持springEL，就是spring表达式，如 #{3+4}
    *       不支持复杂类型的嵌套
    *       不支持JSR303数据校验
    */
    //@Value("${family.family-name}")
    //@Email
    //@NotNull
    private String familyName;

    private Father father;

    private Child child;

    private Mother mother;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }
}
