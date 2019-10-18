package com.company.SimpleFactory;

import org.xml.sax.SAXException;

import java.io.IOException;

public class SimpleFactory {
    public static void main(String[] args) throws IOException, SAXException {
//        Chart   chart   =   null;
//        String  type    =   XmlUtil.getBean();
//        System.out.println(type);
//        chart    = ChartFactory.getChart(type);
//        chart.display();

    }

}

interface Chart{
    public void display();
}

class HistogramChart implements Chart{
    public HistogramChart(){
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显式柱状图");
    }
}


class PieChart implements Chart{
    public PieChart(){
        System.out.println("创建饼图");
    }

    @Override
    public void display() {
        System.out.println("显式饼图");
    }
}

class ChartFactory{
    public static Chart getChart(String type){
       Chart chart = null;
        if (type.equalsIgnoreCase("histogram")){
            //初始化柱状图

            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        }
        else if (type.equalsIgnoreCase("pie")){
            chart = new PieChart();
            System.out.println("初始化设置饼图");
        }
        return chart;
    }
}
//class Chart{
//    private String type;
//    public  Chart(Object[][] data, String type)
//    {
//        this.type = type;
//        if (type.equalsIgnoreCase("histogram")){
//            //初始化柱状图
//        }
//        else if (type.equalsIgnoreCase("pie")){
//
//        }
//        else if (type.equalsIgnoreCase("line")) {
//
//        }
//    }
//    public void display()
//    {
//
//        if (type.equalsIgnoreCase("histogram")){
//            //初始化柱状图
//        }
//        else if (type.equalsIgnoreCase("pie")){
//
//        }
//        else if (type.equalsIgnoreCase("line")) {
//
//        }
//    }
//}

