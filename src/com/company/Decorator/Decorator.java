package com.company.Decorator;



public class Decorator {
    public static void main(String[] args) {
        Component component,componentSB; //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
        componentSB.display();

    }
}


abstract class Component{
    public abstract void display();
}

class ComponentDecorator extends Component{
    private Component component;
    public ComponentDecorator(Component component){
        this.component = component;
    }
    @Override
    public void display() {
        component.display();
    }
}

