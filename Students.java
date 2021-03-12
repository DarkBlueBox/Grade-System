package kz.aitu.oop.project;

import java.util.Scanner;

public class Students  {
    public static int ID= (int) Math.random() ;
   public static  String FirstName;
    public static String LastName;
    public static String Subject;
    public Students () {
        Scanner st = new Scanner(System.in);
System.out.println("Enter first name : ");
FirstName = st.next();
        System.out.println("Enter Last name : ");
        LastName = st.next();
        System.out.println("Enter Subject : ");
        Subject = st.next();
    }
    public void print (){
        System.out.println("First Name is "+ FirstName);
        System.out.println("Last Name is "+ LastName);
        System.out.println("Subject is "+ Subject);
    }
}
