import java.util.*;
public class Login {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the Username :");
    String Username =sc.nextLine();
    String FormattedUsername = Username.toLowerCase();3
    System.out.println("FormattedUsername:");
    if(Username.length()>=6){
        System.out.println("Continue with password");
    }
    else 
    {
        System.out.println("Need minimum 6 characters please check and proceed");
    }
    System.out.println("Enter the password");
    String password = sc.nextLine();
    if(password.length()>7)
    {
    System.out.print("Suceesful login you may login now Thank you");
    }
    else {
        System.out.print("recheck the password and try again");
    }
    sc.close();
}
}
