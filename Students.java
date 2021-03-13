package kz.aitu.oop.project;

import java.util.Scanner;

public class Students  {

    public static int Student_ID ;
   public  static String FirstName;
    public static String LastName;
    public static int Subject_ID;
    public Students () {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        Student_ID = st.nextInt();

        System.out.println("Enter first name : ");
FirstName = st.next();
        System.out.println("Enter Last name : ");
        LastName = st.next();
        System.out.println("1 - Calculus");
        System.out.println("2 - Java");
        System.out.println("3 - Foreign Language");
        System.out.println("4 - Discrete math");
        System.out.println("5 - Social-political education");
        System.out.println("Enter Subject : ");

        Subject_ID = st.nextInt();
    }

}
