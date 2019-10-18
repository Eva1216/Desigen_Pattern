package com.company.AbstractFactory;

public class SpringFactory implements SkinFactory{
    @Override
    public Button CreateButton() {
        return new SpringButton();
    }

    @Override
    public TextField CreateTextField() {
        return new SpringTextField();
    }
}
