package factory;

import product.Chart;
import product.impl.HistogramChart;
import product.impl.LineChart;
import product.impl.PieChart;

/**
 * 工厂类 - 图表工厂类
 * @author ROC
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart concreteChart = null;
        if (type.equalsIgnoreCase(ConcreteFactoryEnum.HISTOGRAM_TYPE.getType())) {
            concreteChart = new HistogramChart();
            System.out.println("Initial the HistogramChart ...");
        } else if (type.equalsIgnoreCase(ConcreteFactoryEnum.PIE_TYPE.getType())) {
            concreteChart = new PieChart();
            System.out.println("Initial the PieChart ...");
        } else if (type.equalsIgnoreCase(ConcreteFactoryEnum.LINE_TYPE.getType())) {
            concreteChart = new LineChart();
            System.out.println("Initial the LineChart ...");
        }
        return concreteChart;
    }
}
