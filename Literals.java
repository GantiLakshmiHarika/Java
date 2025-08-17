public class Literals {
    public static void main(String[] args) {
        String s1 = new String("you cannot change me");
        String s2 = new String("you cannot change me");
        System.out.println("s1==s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        String s3 = "you cannot change me";
        String s4 = "you cannot change me";
        System.out.println("s3==s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));

        String s5 = "you cannot";
        String s6 = s5 + " change me";
        String s7 = "you cannot change me";
        System.out.println("s6==s7: " + (s6 == s7));
        System.out.println("s6.equals(s7): " + s6.equals(s7));

        final String s8 = "you cannot";
        String s9 = s8 + " change me";
        System.out.println("s9==s7: " + (s9 == s7));
        System.out.println("s9.equals(s7): " + s9.equals(s7));
    }
}
