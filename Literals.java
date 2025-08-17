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

        String s = new String("Natural Star Nani");
        System.out.println(s.charAt(8));

        String  str = new String("HARIKA");
        System.out.println(str.equals("harika"));

        String  strs = new String("HARIKA");
        System.out.println(strs.equalsIgnoreCase("harika"));

        String strss = new String("sandeep");
        System.out.println(strss.isEmpty());

        String strse = new String("sandeep");
        System.out.println(strse.length());

        String strses = new String("sandeep");
        System.out.println(strses.substring(3,7));

        String strsesg = new String("sandeep");
        System.out.println(strsesg.replace('a','H'));
            
       String t = "sandeep";
       System.out.println(t.indexOf('d'));
       ///System.out.println(sh.indexOf('e'));
    
       String yt = "sandeep";
       System.out.println(yt.lastIndexOf('p'));

        String yo = "sandeep";
        System.out.println(yo.lastIndexOf('n','p'));

        String yom = "SANDEEP";
        System.out.println(yom.toLowerCase()); 

        
        String yox = "SANDEEP";
        System.out.println(yox.toLowerCase()); 

        
        String yomr = "sandeep";
        System.out.println(yomr.toUpperCase());

        String ram = "   sandeep   ";
        System.out.println(ram.trim().length());






        

       


    }
}
