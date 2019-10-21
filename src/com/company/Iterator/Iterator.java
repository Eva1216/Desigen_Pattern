package com.company.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");
        AbstractObjectList list;
        AbstractIterator iterator;
        list = new ProductList(products); //创建聚合对象
        iterator = list.createIterator(); //创建迭代器对象
        System.out.println("正向遍历：");
        while(!iterator.isLast()) {
            System.out.print(iterator.getNextItem() + "，");
            iterator.next();
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("逆向遍历：");
        while(!iterator.isFirst()) {
            System.out.print(iterator.getPreviousItem() + "，");
            iterator.previous();
        }
    }
}

abstract class AbstractObjectList{
    protected List<Object> objects = new ArrayList<Object>();
    public AbstractObjectList(List objects){
        this.objects = objects;
    }
    public void addObject(Object obj){
        this.objects.add(obj);
    }
    public void removeObject(Object obj){
        this.objects.remove(obj);
    }
    public List getObjects(){
        return this.objects;
    }
    public abstract ProductIterator createIterator();
}

interface AbstractIterator{
    public void next();
    public boolean isLast();
    public void previous();
    public boolean isFirst();
    public Object getNextItem();
    public Object getPreviousItem();
}

