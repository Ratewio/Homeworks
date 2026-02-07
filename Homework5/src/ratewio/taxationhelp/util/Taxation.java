package ratewio.taxationhelp.util;

public class Taxation {
    static final double TAX_EARNING = 0.06;
    static final double TAX_PROFIT = 0.15;

    public static int getTax(int sum, double tax){
        return (int) (sum * tax);
    }
    public static int getTaxForEarnings(int earnings){
        return getTax(earnings, TAX_EARNING);
    }
    public static int getTaxForProfit(int earnings, int spendings){
        int profit = earnings - spendings;
        return profit > 0 ? getTax(profit, TAX_PROFIT) : 0;
    }
}
