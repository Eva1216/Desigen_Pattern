package com.company.Observer;

import java.util.ArrayList;

public class Observer {
    public static void main(String[] args) {
        AllyControlCenter acc;
        acc = new ConcreteAllyControlCenter("金庸群侠");
        //定义四个观察者对象
        ObserverMode player1,player2,player3,player4;
        player1 = new Player("杨过");
        acc.join(player1);
        player2 = new Player("令狐冲");
        acc.join(player2);
        player3 = new Player("张无忌");
        acc.join(player3);
        player4 = new Player("段誉");
        acc.join(player4);
        //某成员遭受攻击
        player1.beAttacked(acc);
    }
}

interface ObserverMode{
    public String getName();
    public void setName(String name);
    public void help(); //声明支援盟友方法
    public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}

abstract class AllyControlCenter{
    protected String allyName;
    protected ArrayList<ObserverMode> players = new ArrayList<ObserverMode>(); //定义一个集合用于存储战队成员
    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
    public String getAllyName() {
        return this.allyName;
    }
    //注册方法
    public void join(ObserverMode obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }
    //注销方法
    public void quit(ObserverMode obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }
    public abstract void notifyObserver(String name);

}

