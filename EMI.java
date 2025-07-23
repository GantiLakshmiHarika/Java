public class EMI {
    public static void main(String args[]) {
        // Local variables
        String car_name = "Mahindra Scorpio";
        double car_rating = 4.7;
        String car_Review = "The Scorpio is one of Mahindra's oldest nameplates in India";
        int car_onpricing = 2190887;
        int down_payment = 380000;
        double bank_interest = 9.50;
        byte loan_period = 4;
        int total_amount = 1810887;
        int payable_amount = 2183760;
        
        double R = bank_interest / 12 / 100;
        int m= loan_period * 12;
        double emi = (total_amount * R * Math.pow(1 + R, m)) 
                    / (Math.pow(1 + R, m) - 1);
        
        System.out.println("Car Name: " + car_name);
        System.out.println("Rating: " + car_rating);
        System.out.println("Review: " + car_Review);
        System.out.println("Loan Details:");
        System.out.println("On-Road Price:" + car_onpricing);
        System.out.println("Down Payment: " + down_payment);
        System.out.println("Loan Amount: " + total_amount);
        System.out.println("Interest Rate: " + bank_interest);
        System.out.println("Loan Period: " + loan_period);
        System.out.println("Total Payable Amount: " + payable_amount);
        System.out.println("EMI: " + emi);
    }
}