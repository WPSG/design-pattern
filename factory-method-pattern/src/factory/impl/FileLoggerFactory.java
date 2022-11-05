package factory.impl;

import factory.LoggerFactory;
import product.Logger;
import product.impl.FileLogger;

/**
 * 文件日志记录器工厂类 - 具体工厂
 * @author ROC
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        System.out.println("Generate the FileLogger");
        return new FileLogger();
    }
}
