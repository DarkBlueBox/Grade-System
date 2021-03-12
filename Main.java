package kz.aitu.oop.project;



import java.sql.SQLException;
import java.util.Scanner;

public class Main extends Students  {
    public static void main(String[] args) throws SQLException {
//        String url = "jdbc:postgresql://localhost:5432/Grading System";
//        String user = "postgres";
//        String password = "POGO988009";
        Connect c = new PostgreSQL();
        PostgreSQL S = new PostgreSQL();

        Scanner scanner = new Scanner(System.in);
        float Total =0,AVG;
        int[] Grade =new int[2];


//        S.ExecSQL("INSERT INTO student(student_id,FirstName,LastName) VALUES (?,?,?)",new String[]{});
//        S.ExecSQL("SELECT student_id,FirstName,LastName  Select student_grade From student",new String[]{});
//if(FirstName.matches("[a-zA-Z]+") && LastName.matches("[a-zA-Z]+") && Subject.matches("[a-zA-Z]+"))
//{
//    S.ExecSQL("INSERT INTO student(student_id,FirstName,LastName) VALUES (?,?,?)",new String[]{});
//    S.ExecSQL("SELECT student_id,FirstName,LastName  Select student_grade From student",new String[]{});
//
//}
//else {
//    System.out.println("Error");
//}

        for(int i=0; i<2; i++) {
            System.out.print("Enter RK"+(i+1)+":");
            Grade[i] = scanner.nextInt();
            Total += Grade[i];
        }
double A =(((95 - (Total * 0.3)) * 100) / 40);

        AVG = Total/2;



        c.connect("jdbc:postgresql://localhost:5432/Grading System?currentSchema=public", "postgres", "POGO988009") ;
        if (Total*0.3>=50)
        {
            System.out.println("Вы допускаетесь на файнал");
            System.out.println("Что бы не получить ретейк или пересдачу >50 % на файнале.");
            System.out.println("Для сохранения степендии 50 % на файнале.");
           if(A>=50 && A<=100) {
               S.ExecSQL("SELECT * FROM grade_s Where grade_id = 1 ", new String[]{});
               System.out.println(">=" + A + " % на файнале.");
               S.ExecSQL("SELECT * FROM grade_s Where grade_id = 2 ", new String[]{});
               System.out.println(">=" + (((90 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
               S.ExecSQL("SELECT * FROM grade_s Where grade_id = 3 ", new String[]{});
               System.out.println(">=" + (((85 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
               S.ExecSQL("SELECT * FROM grade_s Where grade_id = 4 ", new String[]{});
               System.out.println(">=" + (((80 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
           }
           else
               System.out.println("Bigger");
        }
       else if(AVG>=50) {
            System.out.println("Вы допускаетесь на файнал");
            System.out.println("Что бы не получить ретейк или пересдачу >50 % на файнале.");
            System.out.println("Для сохранения степендии " + (((70 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            S.ExecSQL("SELECT * FROM grade_s Where grade_id = 3 ", new String[]{});
            System.out.println(">="+(((85 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
           S.ExecSQL("SELECT * FROM grade_s Where grade_id = 4 ", new String[]{});
           System.out.println(">="+(((80-(Total*0.3))*100)/40) + " % на файнале.");
           S.ExecSQL("SELECT * FROM grade_s Where grade_id = 5 ", new String[]{});
           System.out.println(">="+(((75-(Total*0.3))*100)/40) + " % на файнале.");
           S.ExecSQL("SELECT * FROM grade_s Where grade_id = 6 ", new String[]{});
           System.out.println(">="+(((70-(Total*0.3))*100)/40) + " % на файнале.");

               S.ExecSQL("SELECT * FROM grade_s Where grade_id = 7 ", new String[]{});
               System.out.println(">=" + (((65 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
               S.ExecSQL("SELECT * FROM grade_s Where grade_id = 8 ", new String[]{});
               System.out.println(">=" + (((60 - (Total * 0.3)) * 100) / 40) + " % на файнале.");

           }
        else {
            System.out.println("Вы не допускаетесь на файнал");
        }



    }
}
