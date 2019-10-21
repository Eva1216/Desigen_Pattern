package com.company.TemplateMethod;

public class  CurrentAccount extends Account{

    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
