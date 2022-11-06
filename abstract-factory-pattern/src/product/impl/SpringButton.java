package product.impl;

import product.Button;

/**
 * Spring 风格 Button产品 - 具体产品
 * @author ROC
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("Display the SpringButton.");
    }
}
