import java.util.Scanner;

public class SalesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int customerId;
        String customerName;
        double totalPurchases = 0;
        int interactionCount = 0;

        System.out.print("Enter Customer ID: ");
        customerId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        String choice = "yes";

        while (!choice.equalsIgnoreCase("no")) {
            System.out.print("Enter Sale Amount: ");
            double sale = sc.nextDouble();
            totalPurchases += sale;
            interactionCount++;

            sc.nextLine();
            System.out.print("Do you want to continue? (yes/no): ");
            choice = sc.nextLine();
        }

        String status = interactionCount <= 5 ? "Safed" : "NotSafed";

        System.out.println("\n--- Customer Sales Summary ---");
        System.out.println("Customer ID       : " + customerId);
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Total Purchases   : " + totalPurchases);
        System.out.println("Interaction Count : " + interactionCount);
        System.out.println("Status            : " + status);

        sc.close();
    }
}
