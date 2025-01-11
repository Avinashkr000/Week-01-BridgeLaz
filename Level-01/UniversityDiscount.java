public class UniversityDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        double DiscountPercentage = 10;
        double discount = (fee * (1/DiscountPercentage));
        double discountedFee = fee - discount;
		// the results
        System.out.println("The discount amout is INR " + discount + "and final discounted fee is INR  " + discountedFee);
    }
}
