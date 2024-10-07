package ArrayStrings;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max_price = 0;
        int min_price = 100000;

        for (int price: prices){
           if (price < min_price){
               min_price = price;
           }
           int profit = price - min_price;

           if (profit > max_price){
               max_price = profit;
           }
        }

        return max_price;

    }
}
