package TASKfIle;
public class Discount {
    public static void main(String[] args) {
        byte std_grade = 5;
        int tutionfee = 50000;
        double discount = 0;
        boolean academic_topper = true;
        if (std_grade >= 9 && std_grade <= 12) {
            if (academic_topper) {
                discount = 20;
            } else {
                discount = 10;
            }
        } else if (std_grade >= 6 && std_grade <= 8) {
            discount = 5;
        } else {
            discount = 0;
            System.out.println("No discount");
        }

        if (std_grade == 10) {
            discount += 3;
        } else if (std_grade == 12) {
            discount += 5;
        } else {
            System.out.println("No additional discounts for other grades");
        }

        switch (std_grade) {
            case 9:
            case 10:
            case 11:
            case 12:
                discount = academic_topper ? 20 : 10;
                break;

            case 6:
            case 7:
            case 8:
                discount = 5;
                break;

            default:
                if (std_grade < 6) {
                    discount = 0;
                    System.out.println("No discount");
                }
        }

        switch (std_grade) {
            case 10:
                discount += 3;
                break;
            case 12:
                discount += 5;
                break;
            default:
                System.out.println("No additional discounts");
        }
        double discounted = tutionfee - (tutionfee * discount / 100);
        System.out.println("Grade Level: " + std_grade);
        System.out.println("Academic Topper: " + academic_topper);
        System.out.println("Tuition Fee Before Discount: " + tutionfee);
        System.out.println("Total Discount Applied: " + discount);
        System.out.println("Final Tuition Fee: " + discounted);
    }
}
