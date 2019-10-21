package com.company.TemplateMethod;

public class SavingAccount extends Account{

    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}
