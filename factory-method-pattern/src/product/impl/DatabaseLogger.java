package product.impl;

import product.Logger;

/**
 * 数据库记录器 - 具体产品
 * @author ROC
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("Logs of Database");
    }
}
