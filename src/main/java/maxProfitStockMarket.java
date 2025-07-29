public class maxProfitStockMarket {
    // User function Template for Java
        public static int maximumProfit(int prices[]) {
            // Code here
            int n=prices.length;

            int profit=0;

            int minPrice=prices[0];
            int maxProfit=0;

            for(int i=1; i<n; i++){
                profit=prices[i]-minPrice;
                maxProfit=Math.max(profit,maxProfit);
                minPrice=Math.min(minPrice,prices[i]);
            }

            return maxProfit;

        }
        public static void main(String[] args){
            int[] arr={11,2,3,4,5,11,7,20,9};
            System.out.print(maximumProfit(arr));
        }
}
