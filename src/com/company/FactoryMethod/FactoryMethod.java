package com.company.FactoryMethod;

import com.company.XMLUtil.XmlUtil;

import com.company.FactoryMethod.FileLoggerFactory;
public class FactoryMethod {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory) XmlUtil.getBean();
//        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writelog();
    }

}

interface Logger{
    public void writelog();
}

abstract class LoggerFactory{
    public void writeLog(){
        Logger logger = this.createLogger();
        logger.writelog();
    }
    public abstract Logger createLogger();

}

