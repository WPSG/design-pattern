package factory.impl;

import factory.SkinFactory;
import product.Button;
import product.ComboBox;
import product.TextField;
import product.impl.SpringButton;
import product.impl.SpringComboBox;
import product.impl.SpringTextField;

/**
 * Spring 风格工厂 - 具体工厂
 * @author ROC
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        System.out.println("Generate the SpringButton...");
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Generate the SpringTextField...");
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("Generate the SpringComboBox...");
        return new SpringComboBox();
    }
}
