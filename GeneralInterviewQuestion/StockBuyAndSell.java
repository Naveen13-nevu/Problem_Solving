public class StockBuyAndSell {
    public static void main(String[] args) {
        
        int prices[] = {21,32,3,-11,3,44,5};
        int min = prices[0];
        int profit =0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int currentProfit = prices[i]- min;
            if(currentProfit > profit){
                profit = currentProfit;
            }
        }
        System.out.println(profit);
    }
}
