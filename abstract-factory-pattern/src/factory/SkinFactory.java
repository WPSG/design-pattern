package factory;

import product.Button;
import product.ComboBox;
import product.TextField;

/**
 * 界面皮肤接口工厂 - 抽象工厂
 * @author ROC
 */
public interface SkinFactory {
    /**
     * 创建 Button 对象
     * @return Button 对象
     */
    public Button createButton();

    /**
     * 创建 TextField 对象
     * @return TextField 对象
     */
    public TextField createTextField();

    /**
     * 创建 ComboBox 对象
     * @return ComboBox 对象
     */
    public ComboBox createComboBox();
}
