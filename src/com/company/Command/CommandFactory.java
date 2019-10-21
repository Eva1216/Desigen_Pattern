package com.company.Command;

import com.company.XMLUtil.XmlUtil;

import javax.print.attribute.standard.JobKOctets;
import java.util.ArrayList;

public class CommandFactory {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");
        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");
        Command command1,command2;
        //通过读取配置文件和反射生成具体命令对象
        command1 = (Command)XmlUtil.getBean(0);
        command2 = (Command)XmlUtil.getBean(1);
        //将命令对象注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);
        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();
        //调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();
    }


}


class CommandQueue{
    private ArrayList<Command> commands = new ArrayList<Command>();
    public void addCommand(Command command){
        commands.add(command);
    }
    public void removeCommand(Command command){
        commands.remove(command);
    }

    public void execut(){
        for (Object command:commands){
            ((Command)command).execute();
        }
    }

}
//功能键设置窗口类
class FBSettingWindow {
    private String title; //窗口标题
    //定义一个ArrayList来存储所有功能键
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();
    public FBSettingWindow(String title) {
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }
    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }
    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton)obj).getName());
        }
        System.out.println("------------------------------");
    }
}


//功能键类：请求发送者
class FunctionButton {
    private String name; //功能键名称
    private Command command; //维持一个抽象命令对象的引用
    public FunctionButton(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    //为功能键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }
    //发送请求的方法
    public void onClick() {
        System.out.print("点击功能键：");
        command.execute();
    }
}


abstract class Command{
    public abstract void execute();
}

