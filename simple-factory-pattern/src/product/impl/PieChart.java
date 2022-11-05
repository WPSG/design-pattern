package product.impl;

import product.Chart;

/**
 * 具体产品类 - PieChart
 * @author ROC
 */
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("Generate the PieChart!");
    }

    @Override
    public void display() {
        System.out.println("Display the PieChart!");
    }
}
