package com.company.FactoryMethod;

public class FileLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
