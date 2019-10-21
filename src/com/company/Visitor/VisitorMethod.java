package com.company.Visitor;

import com.company.XMLUtil.XmlUtil;

import java.util.ArrayList;

public class VisitorMethod {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Employee fte1,fte2,fte3,pte1,pte2;
        fte1 = new FulltimeEmployee("张无忌",3200.00,45);
        fte2 = new FulltimeEmployee("杨过",2000.00,40);
        fte3 = new FulltimeEmployee("段誉",2400.00,38);
        pte1 = new ParttimeEmployee("洪七公",80.00,20);
        pte2 = new ParttimeEmployee("郭靖",60.00,18);
        list.addEmployee(fte1);
        list.addEmployee(fte2);
        list.addEmployee(fte3);
        list.addEmployee(pte1);
        list.addEmployee(pte2);
        Department dep;
        dep = (Department) XmlUtil.getBean();
        list.accept(dep);

    }
}

interface Employee{
    public void accept(Department handler);
}

abstract class Department{
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}

class EmployeeList
{
    //定义一个集合用于存储员工对象
    private ArrayList<Employee> list = new ArrayList<Employee>();
    public void addEmployee(Employee employee)
    {
        list.add(employee);
    }
    //遍历访问员工集合中的每一个员工对象
    public void accept(Department handler)
    {
        for(Object obj : list)
        {
            ((Employee)obj).accept(handler);
        }
    }
}

