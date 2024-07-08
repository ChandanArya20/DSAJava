public class BuyAndSellStock1 {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit2(prices));
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int currentProfit = prices[j]-prices[i];

                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }

        return maxProfit;
    }

    public static int maxProfit2(int[] prices){
        int maxProfit = 0;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            int currentProfit = prices[i] - buyPrice;
            maxProfit = Math.max(currentProfit, maxProfit);

        }

        return maxProfit;
    }
}
