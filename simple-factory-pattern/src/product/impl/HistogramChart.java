package product.impl;

import product.Chart;

/**
 * 具体产品类 - HistogramChart
 * @author ROC
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("Generate the HistogramChart!");
    }

    @Override
    public void display() {
        System.out.println("Display the HistogramChart!");
    }
}
