package Problems;

public class Problem9 {
    public static void main(String[] args) {
        /*
         * Problem 9:-
         * Create a constant named GST_RATE = 0.18.
         * Given a product price and quantity as input, compute:
         * • Net price
         * • GST
         * • Total payable
         * Use appropriate data types and constants.
         */

        final double GST_RATE = 0.18;
        int quantity = 8;
        double price = 500.0;
        double netPrice = price * quantity;
        double gstAmount = netPrice * GST_RATE;
        double totalPayable = netPrice + gstAmount;

        System.out.println("Net Price is " + netPrice);
        System.out.println("GST Amount is " + gstAmount);
        System.out.println("So Total Payble Amount Including NetPrice + GST is " + totalPayable);
    }    
}
