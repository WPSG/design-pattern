package factory.impl;

import factory.SkinFactory;
import product.Button;
import product.ComboBox;
import product.TextField;
import product.impl.SummerButton;
import product.impl.SummerComboBox;
import product.impl.SummerTextField;

/**
 * Summer 风格工厂 - 具体工厂
 * @author ROC
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        System.out.println("Generate the SummerButton...");
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Generate the SummerTextField...");
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("Generate the SummerComboBox...");
        return new SummerComboBox();
    }
}
