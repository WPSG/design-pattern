package factory;

import product.Logger;

/**
 * 日志记录器工厂接口 - 抽象工厂
 * @author ROC
 */
public interface LoggerFactory {
    /**
     * 生成日志记录器对象
     * @return 日志记录器对象
     */
    public Logger createLogger();
}
