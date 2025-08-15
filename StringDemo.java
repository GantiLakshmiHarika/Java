// case 1: string - immutabible 
public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("harika");
        //s1=s1.concat("software");
        //s1.concat("software"); 
        System.out.println(s1);
    }
}

// string buffer - mutabible 
public class StringDemos{
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("harika");
        s1.append("software");
        System.out.println(s1);
    }
}

 // case 2:  == opertors vs equals() method using string.
 String s1= new String("harika");
 String s2= new String("harika");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));

// output : false  == created a 2 objects which take different memory locations
//  true equals() used the same memory location.

//== opertors vs equals() method using stringbuffer.
public static void main(String[] args) {
        StringBuffer s1= new StringBuffer("harika");
        StringBuffer s2= new StringBuffer("harika");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
//output : false  created a 2 objects which take different memory locations
//false  StringBuffer does not override the equals() method from Object