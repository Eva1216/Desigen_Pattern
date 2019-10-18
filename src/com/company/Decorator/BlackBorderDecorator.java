package com.company.Decorator;

public class BlackBorderDecorator extends  ComponentDecorator{

    public BlackBorderDecorator(Component component) {
        super(component);
    }
    public void display(){
        this.setScrollBar();
        super.display();
    }
    public void setScrollBar(){
        System.out.println("为构件增加黑色边框！");
    }
}
