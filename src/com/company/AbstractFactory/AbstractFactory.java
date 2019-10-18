package com.company.AbstractFactory;

import com.company.XMLUtil.XmlUtil;

public class AbstractFactory {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SkinFactory factory;
        Button bt;
        TextField tf;
        factory = (SkinFactory) XmlUtil.getBean();
//        Class c = Class.forName("com.company.AbstractFactory.SummerFactory");
//        factory = (SkinFactory) c.newInstance();

        //
        bt = factory.CreateButton();
        tf = factory.CreateTextField();
        bt.display();
        tf.display();

    }
}

interface Button{
    public void display();
}


interface  TextField{
    public void display();
}

interface SkinFactory{
    public Button CreateButton();
    public TextField CreateTextField();
}

