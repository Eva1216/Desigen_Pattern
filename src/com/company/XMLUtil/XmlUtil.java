package com.company.XMLUtil;

import java.awt.*;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlUtil {
    public static void main(String[] args) {
        return;
    }
    //该方法用于从XML配置文件中提取图表类型，并返回类型名
    public static Object getBean() {
        try {
//创建文档对象
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            // step 2：获得具体的dom解析器
            DocumentBuilder db = dbf.newDocumentBuilder();

            // step 3:解析一个xml文档，获得Document对象（根节点）
            // 此文档放在项目目录下即可
            Document doc = db.parse(new File("config.xml"));

            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
//            System.out.println(cName);
            Class  c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //该方法用于从XML配置文件中提取图表类型，并返回类型名
    public static Object getBean(String args) {
        try {
//创建文档对象
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            // step 2：获得具体的dom解析器
            DocumentBuilder db = dbf.newDocumentBuilder();

            // step 3:解析一个xml文档，获得Document对象（根节点）
            // 此文档放在项目目录下即可
            Document doc = db.parse(new File("config.xml"));
            Node classNode = null;
            NodeList nl = doc.getElementsByTagName("className");
            if (args.equals("image")){
                classNode = nl.item(0).getFirstChild();
            }
            else if (args.equals("os")){
                classNode = nl.item(1).getFirstChild();
            }
            String cName = classNode.getNodeValue();
            System.out.println(cName);
            Class  c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
