import factory.SkinFactory;
import factory.impl.SummerSkinFactory;
import product.Button;
import product.ComboBox;
import product.TextField;

/**
 * 客户端测试代码
 * @author ROC
 */
public class Main {
    public static void main(String[] args) {
        SkinFactory factory = new SummerSkinFactory();
        Button button = factory.createButton();
        ComboBox comboBox = factory.createComboBox();
        TextField textField = factory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }
}