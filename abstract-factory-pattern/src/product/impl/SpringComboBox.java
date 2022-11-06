package product.impl;

import product.ComboBox;

/**
 * Spring 风格 ComboBox 产品 - 具体产品
 * @author ROC
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("Display the SpringComboBox.");
    }
}
