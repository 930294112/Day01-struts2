package com.lanou.action;

/**
 * Created by dllo on 17/10/10.
 */
 /*
    动作方法
    访问权限必须是public,strut2才能访问到该方法
    返回值必须是string类型,代表该动作执行后的结果
     */
public class HelloAction {
    public String sayHello(){
        System.out.println("动作方法开始执行");
        return "success";
    }
}
