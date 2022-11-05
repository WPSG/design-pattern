import factory.ChartFactory;
import product.Chart;

/**
 * 客户端测试代码
 * @author ROC
 */
public class Main {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.display();
    }
}