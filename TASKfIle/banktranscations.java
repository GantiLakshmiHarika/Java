package TASKfIle;

public class banktranscations { 
    public static void main(String[] args) {

        String Accountholdername = "Sandy";
        int account_balance = 900000;
        int deposite_amount = 23000;
        int withdrawl_amount = 40000;
        byte noTranscations = 4;
        int minimum_balance = 10000;
        boolean account = true; 
        //Arthmetic operator
        account_balance += deposite_amount;  
        account_balance -= withdrawl_amount; 
        // relational operator
        boolean balance = account_balance < minimum_balance; 
        // logical operator
        boolean s = deposite_amount >= minimum_balance && account;
        // Incremental operation
        noTranscations++;
        System.out.println("Accountholdername: " + Accountholdername);
        System.out.println("Final balance: " + account_balance);
        System.out.println("noTranscations: " + noTranscations);
    }
}
