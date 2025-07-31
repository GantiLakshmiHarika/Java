import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    int attendanceCredits = 0;
    int performanceCredits = 0;

    Scanner sc = new Scanner(System.in);

    public void inputStudentDetails() {
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
    }

    public int sessionsCredits() {
        System.out.print("Enter number of sessions attended: ");
        int sessionsAttended = sc.nextInt();

        if (sessionsAttended >= 30) {
            attendanceCredits += 5;
        } else if (sessionsAttended >= 20) {
            attendanceCredits += 3;
        } else {
            attendanceCredits += 0;
        }
        return attendanceCredits;
    }

    public int scoreCredits() {
        System.out.print("Enter performance score: ");
        int score = sc.nextInt();

        if (score >= 85) {
            performanceCredits += 5;
        } else if (score >= 60) {
            performanceCredits += 3;
        } else {
            performanceCredits += 0;
        }
        return performanceCredits;
    }

    public void finalAchievement() {
        int totalCredits = sessionsCredits() + scoreCredits();
        System.out.println("Final Achievement Credits: " + totalCredits);

        if (totalCredits >= 10) {
            System.out.println("== GOLD ==");
        } else if (totalCredits >= 8) {
            System.out.println("== SILVER ==");
        } else {
            System.out.println("== NEED IMPROVEMENT ==");
        }
    }

    public int trainerRatings() {
        System.out.print("Enter trainer rating (1-5): ");
        int rating = sc.nextInt();
        if (rating >= 4) {
            return 2000;
        } else if (rating >= 2) {
            return 1000;
        } else {
            return 500;
        }
    }
}

class Trainer {
    int trainerID;
    String trainerName;
    int totalSessionsTaken;
    int paymentForSessions;
    int totalPayment;

    Scanner sc = new Scanner(System.in);


    public void inputTrainerDetails() {
        System.out.print("Enter Trainer ID: ");
        trainerID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Trainer Name: ");
        trainerName = sc.nextLine();
    }

    
    public void sessionsPayments(Student studentObj) {
        System.out.print("Enter Total Sessions Taken: ");
        totalSessionsTaken = sc.nextInt();
        paymentForSessions = 1500 * totalSessionsTaken;

        int trainingBonus = studentObj.trainerRatings();
        totalPayment = paymentForSessions + trainingBonus;

        System.out.println("==== TRAINER PAYMENT DETAILS ====");
        System.out.println("Trainer ID: " + trainerID);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Total Payment: " + totalPayment);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Trainer trainer = new Trainer();

        System.out.println("=== STUDENT SECTION ===");
        student.inputStudentDetails();
        student.finalAchievement();

        System.out.println("\n=== TRAINER SECTION ===");
        trainer.inputTrainerDetails();
        trainer.sessionsPayments(student);

        System.out.print("\nDo you want to run again? (yes/no): ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes")) {
            main(null); 
    }
}
}