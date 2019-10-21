package com.company.Strategy;

import com.company.XMLUtil.XmlUtil;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class StrategyMethod {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");
        Discount discount;
        discount = (Discount) XmlUtil.getBean(); //读取配置文件并反射生成具体折扣对象
        mt.setDiscount(discount); //注入折扣对象
        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);
    }
}

class MovieTicket {
    private double price;
    private Discount discount; //维持一个对抽象折扣类的引用

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个折扣类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }
}
interface Discount{
    public double calculate(double price);
}

