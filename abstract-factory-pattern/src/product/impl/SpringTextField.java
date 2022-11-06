package product.impl;

import product.TextField;

/**
 * Spring 风格 TextField 产品 - 具体产品
 * @author ROC
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Display the SpringTextField.");
    }
}
