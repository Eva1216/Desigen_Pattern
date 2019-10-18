package com.company.FactoryMethod;

public  class DatabaseLogger implements Logger{

    @Override
    public void writelog() {
        System.out.println("数据库日志记录");
    }
}
