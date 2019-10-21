package com.company.TemplateMethod;

import com.company.Facade.Facade;
import com.company.XMLUtil.XmlUtil;

import java.io.Console;

public class TemplateMethod {
    public static void main(String[] args) {
        Account account;
        account = (Account) XmlUtil.getBean(); //读取配置文件并反射生成具体折扣对象
        account.handle("张无忌","123456");

    }
}


abstract class Account{
    public boolean validate(String account,String password){
        if (account.equals("张无忌") && password.equals("123456")){
            return true;
        }
        return false;
    }
    public abstract void calculateInterest();
    public void display()
    {
        System.out.println("显示利息！");
    }
    public void handle(String account,String password){
        if (!validate(account,password)){
            return;
        }
        calculateInterest();
        display();
    }
}

