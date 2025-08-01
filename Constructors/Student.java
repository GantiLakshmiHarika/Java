package Constructors;

import java.util.Scanner;

public class Student { 

  // instance variable 
  int studentId;
  String studentname;
  int studentscore;
  // there are two types of constructors in java -> default constructor ,
  // here i used Parameterized constructor 
  public  Student(int id, String name, int score)
  { 
     this.studentId = id;
     this.studentname = name;
     this.studentscore= score;
  }
  public  void  displayInfo()
  {
    System.out.println("studentId:"+studentId);
    System.out.println("studentname:"+studentname);
    System.out.println("studentscore:"+studentscore);
  } 
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter the studentid :" );
      int id = sc.nextInt();
       sc.nextLine();
    // System.out.println("enter the studentname :");
      //String name= sc.nextLine();
      
     System.out.print("Enter the student name: ");
     String name = sc.nextLine();
      
     System.out.println("enter the studentscore :" );
      int score = sc.nextInt();

     // object creation for constructor
     Student s1 =new Student( id,name,score); 
      s1.displayInfo();
          sc.close();
  }

  }

