package com.company.Facade;

public class Facade {
    public static void main(String[] args) {
        GeneralSwitchFacade gsf=new GeneralSwitchFacade();
        gsf.on();
        System.out.println("-----------------------");
        gsf.off();
    }
}
