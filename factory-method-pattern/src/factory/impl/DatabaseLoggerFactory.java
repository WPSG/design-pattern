package factory.impl;

import factory.LoggerFactory;
import product.Logger;
import product.impl.DatabaseLogger;

/**
 * 数据库日志记录器工厂类 - 具体工厂
 * @author ROC
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        System.out.println("Generate the DatabaseLogger");
        return new DatabaseLogger();
    }
}
