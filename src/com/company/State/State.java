package com.company.State;

public class State {
    public static void main(String[] args) {
        Account acc = new Account("段誉",0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}
class Account {
    private AccountState state; //维持一个对抽象状态对象的引用
    private String owner; //开户名
    private double balance = 0; //账户余额
    public Account(String owner,double init) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this); //设置初始状态
        System.out.println(this.owner + "开户，初始金额为" + init);
        System.out.println("---------------------------------------------");
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setState(AccountState state) {
        this.state = state;
    }
    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount); //调用状态对象的deposit()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }
    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount); //调用状态对象的withdraw()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this. state.getClass().getName());
        System.out.println("---------------------------------------------");
    }
    public void computeInterest()
    {
        state.computerInterest(); //调用状态对象的computeInterest()方法
    }

}


abstract class AccountState{
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computerInterest();
    public abstract void stateCheck();
}

