package factory;

/**
 * 常量类，存放具体产品种类。
 * @author ROC
 */
public enum ConcreteFactoryEnum {

    /**
     * 具体产品类 - histogram
     */
    HISTOGRAM_TYPE("histogram"),
    /**
     * 具体产品种类 - pie
     */
    PIE_TYPE("pie"),
    /**
     * 具体产品种类 - line
     */
    LINE_TYPE("line");

    private final String type;

    ConcreteFactoryEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
