public class ProfitAndLoss {
    public static void main(String[] args) {
        int CostPrice = 129;
        int Sellingprice = 191;

        int profit = Sellingprice - CostPrice;

        int loss = CostPrice - Sellingprice;

        double ProfiPercentage = ((float)profit/CostPrice)*100;

        System.out.println("The cost price is INR 129 and Selling price is 191");
        System.out.println("The profit is INR " + profit + "and the profit Percentage is" + ProfiPercentage);
    }
}
