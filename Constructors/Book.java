package Constructors;
import java.util.*;
public class Book {
    //instance variable
    int bookid;
    String bookname;
    String bookauthor;
    int bookprice;
   
    // constructor using  using parameterized  constructor
    public Book(int id, String name, String author, int price) {
     this.bookid = id;
     this.bookname =name;
     this.bookauthor=author;
     this.bookprice=price;

} 
  // printing
  public void bookdetails()
  {
   System.out.println("bookid : "+bookid);
   System.out.println("bookname :"+bookname);
   System.out.println("bookauthor :"+bookauthor);
   System.out.println("bookprice :"+bookprice);
  }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     System.out.println("enter the book id : ");
     int id = sc.nextInt();
     sc.nextLine();

     System.out.println("enter the  book name :");
     String name =sc.nextLine();

     System.out.println("enter the book author :");
     String author = sc.nextLine();

     System.out.println("enter the book price :");
     int price = sc.nextInt();
      sc.nextLine();
      
      //object creation
      Book b1 = new Book(id,name,author,price);
     b1.bookdetails();
     sc.close();
}
}
