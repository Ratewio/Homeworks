package ratewio.shipmenttax.utils;

public class TaxCalculator {
    static final double
            WEIGHT_TAX = 100,
            COST_TAX = 0.01;
    public static int getTaxes(int cost, int weight){
        return (int) (weight * WEIGHT_TAX) + (int) (cost * COST_TAX);
    }
}
