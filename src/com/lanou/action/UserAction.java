package com.lanou.action;

/**
 * Created by dllo on 17/10/10.
 */
public class UserAction {
    private String username="张三";
  //添加用户
    public String addUser(){
        return "succsee";
    }
    //删除用户

    public String deleteUser(){
        return "delete";
    }
    //修改用户
    public String updateUser(){
        return "error";
    }
}
