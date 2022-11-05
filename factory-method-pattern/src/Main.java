import factory.LoggerFactory;
import factory.impl.FileLoggerFactory;
import product.Logger;

/**
 * 客户端测试代码
 * @author ROC
 */
public class Main {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}