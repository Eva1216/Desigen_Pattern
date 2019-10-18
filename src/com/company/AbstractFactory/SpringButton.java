package com.company.AbstractFactory;

public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("blue button");
    }
}
