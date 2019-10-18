package com.company.FactoryMethod;

public class FileLogger implements Logger{

    @Override
    public void writelog() {
        System.out.println("文件日志记录");
    }
}
