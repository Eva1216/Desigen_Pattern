package com.company.FactoryMethod;

public class DatabaseLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
