package com.company.Proxy;

public class Logger{
    public void Log(String userId){
        System.out.println("更新数据库，用户查询次数加1！"+ userId);
    }

}
