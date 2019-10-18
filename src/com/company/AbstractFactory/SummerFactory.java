package com.company.AbstractFactory;

public class SummerFactory implements SkinFactory{
    @Override
    public Button CreateButton() {
        return new SummerButton();
    }

    @Override
    public TextField CreateTextField() {
        return new SummerTextField();
    }
}
