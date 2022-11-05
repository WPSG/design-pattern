package product.impl;

import product.Logger;

/**
 * 文件日志记录器 - 具体产品
 * @author ROC
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("Logs of FileLogger");
    }
}
