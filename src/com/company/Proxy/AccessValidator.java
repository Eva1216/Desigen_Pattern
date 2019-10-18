package com.company.Proxy;

public class AccessValidator{
    public boolean validate(String userId){
        System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户？");
        if (userId.equals("杨过")) {
            System.out.println(userId + "登录成功");
            return true;
        }
        else {
            System.out.println(userId + "登录失败");
            return false;
        }
    }
}
