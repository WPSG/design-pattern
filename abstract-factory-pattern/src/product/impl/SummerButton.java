package product.impl;

import product.Button;

/**
 * Summer 风格 Button 产品 - 具体产品
 * @author ROC
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("Display the SummerButton.");
    }
}
