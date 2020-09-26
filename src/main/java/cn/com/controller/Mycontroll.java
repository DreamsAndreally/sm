package cn.com.controller;

import cn.com.domain.Dog;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

@Controller
public class Mycontroll {
    @Autowired
    protected Dog dog;
    public void aa(){
        System.out.println("执行controller");
    }
}
