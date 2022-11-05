package product.impl;

import product.Chart;

/**
 * 具体产品类 - LineChart
 * @author ROC
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("Generate the LineChart!");
    }

    @Override
    public void display() {
        System.out.println("Display the LineChart!");
    }
}
