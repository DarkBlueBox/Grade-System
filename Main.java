package kz.aitu.oop.project;



import java.sql.SQLException;
import java.util.Scanner;

public class Main extends Students  {
    public static void main(String[] args) throws SQLException {
        Connect c = new PostgreSQL();
        PostgreSQL S = new PostgreSQL();
        c.connect("jdbc:postgresql://localhost:5432/Grading System?currentSchema=public", "postgres", "POGO988009") ;
        Scanner scanner = new Scanner(System.in);
        float Total =0,AVG;
        double[] Grade =new double[2];
        int G_S_id = Student_ID;
        double A=(((95 - (Total * 0.3)) * 100) / 40);
double Am=(((90 - (Total * 0.3)) * 100) / 40);
double Bp= (((85 - (Total * 0.3)) * 100) / 40);
double B =(((80 - (Total * 0.3)) * 100) / 40);//(N.Bauyrzhan)these are the equations for calculating the required percentage on the final exam for some grades and scholarships.
double Bm =(((75-(Total*0.3))*100)/40);
double St= (((70-(Total*0.3))*100)/40);
double Cp =(((70-(Total*0.3))*100)/40);

//(N.Bauyrzhan) conditional statement that checks whether the entered data consists of uppercase and lowercase letters.
if(FirstName.matches("[a-zA-Z]+")&& LastName.matches("[a-zA-Z]+") && (Subject_ID>0 && Subject_ID<=5) ) {
    S.ExecSQL("INSERT INTO student(student_id,FirstName,LastName) VALUES (?,?,?)");
}

else {
    System.out.println("Error");
}
//        S.Check(Student_ID);
//        String Ch=scanner.nextLine();
//if( Ch=="Da") {
//
//    for (int i = 0; i < 2; i++)
//    {
//        System.out.print("Enter RK" + (i + 1) + ":");
//        Grade[i] = scanner.nextInt();
//        Total += Grade[i];
//    }
//
//    double RK1 = Grade[0];
//    double RK2 = Grade[1];
//    AVG = Total / 2;
//
//
//
//    if (Total * 0.3 >= 50 && RK1>=50 && RK2>=50)
//    {
//        System.out.println("Вы допускаетесь на файнал");
//        System.out.println("Что бы не получить ретейк или пересдачу >50 % на файнале.");
//        System.out.println("Для сохранения степендии 50 % на файнале.");
//        if (A >= 50 && A <= 100) {
//            System.out.println("Для получения оценки A >=" + A + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку A ");
//        }
//        if (Am >= 50 || Am <= 100) {
//            System.out.println("Для получения оценки A- >=" + (((90 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку A-");
//        }
//        if (Bp >= 50 || Bp <= 100) {
//            System.out.println("Для получения оценки B+ >=" + (((85 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку B+");
//        }
//        if (B >= 50 || B <= 100) {
//            System.out.println("Для получения оценки B >=" + (((80 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку B");
//        }
//        if (Bm >= 50 || Bm <= 100) {
//            System.out.println("Для получения оценки B- >= " + (((75 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку B-");
//        }
//        if (Cp >= 50 || Cp <= 100) {
//            System.out.println("Для получения оценки C+ >=" + (((70 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку C+");
//        }
//
//        S.UPdate( Subject_ID, RK1, RK2, St, A, Am, Bp, B, Bm);
//    }
//    else if (AVG >= 50 && RK1>=50 && RK2>=50) {
//        System.out.println("Вы допускаетесь на файнал");
//        System.out.println("Что бы не получить ретейк или пересдачу >50 % на файнале.");
//        if ((Cp >= 50 || Cp <= 100)) {
//            System.out.println("Для сохранения степендии " + (((70 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно Сохранить степендию");
//        }
//        if (Bp >= 50 || Bp <= 100) {
//            System.out.println("Для получения оценки B+ >=" + (((85 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку B+");
//        }
//        if (B >= 50 || B <= 100) {
//            System.out.println("Для получения оценки B >=" + (((80 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку B");
//        }
//        if (Bm >= 50 || Bm <= 100) {
//            System.out.println("Для получения оценки B- >= " + (((75 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
//        } else {
//            System.out.println("не возможно получить оценку B-");
//        }
//        S.UPdate( Subject_ID, RK1, RK2, St, A, Am, Bp, B, Bm);
//    }
//
//    else {
//        System.out.println("Вы не допускаетесь на файнал");
//    }
//
//
//
//}
//else if(Ch=="Net"){
// System.exit(0);
//}



        for(int i=0; i<2; i++) {
            System.out.print("Enter RK"+(i+1)+":");
            Grade[i] = scanner.nextInt();
            Total += Grade[i];
        }

double RK1= Grade[0];
double RK2= Grade[1];
AVG = Total/2;



        if (Total*0.3>=50 && RK1>=50 && RK2>=50) {
            System.out.println("Вы допускаетесь на файнал");
            System.out.println("Что бы не получить ретейк или пересдачу >50 % на файнале.");
            System.out.println("Для сохранения степендии 50 % на файнале.");
            if (A >= 50 && A <= 100) {
                System.out.println("Для получения оценки A >=" + A + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку A ");
            }
            if (Am >= 50 || Am <= 100) {
                System.out.println("Для получения оценки A- >=" + (((90 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку A-");
            }
            if (Bp >= 50 || Bp <= 100) {
                System.out.println("Для получения оценки B+ >=" + (((85 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку B+");
            }
            if (B >= 50 || B <= 100) {
                System.out.println("Для получения оценки B >=" + (((80 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку B");
            }
            if (Bm >= 50 || Bm <= 100) {
                System.out.println("Для получения оценки B- >= " + (((75 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку B-");
            }
            if (Cp >= 50 || Cp <= 100) {
                System.out.println("Для получения оценки C+ >=" + (((70 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку C+");
            }

            S.Grade_s( G_S_id, Student_ID, Subject_ID,RK1,RK2,St,A,Am,Bp,B,Bm);
        }


       else if(AVG>=50 && RK1>=50 && RK2>=50)  {
            System.out.println("Вы допускаетесь на файнал");
            System.out.println("Что бы не получить ретейк или пересдачу >50 % на файнале.");
            if((Cp >= 50 || Cp <= 100)) {
                System.out.println("Для сохранения степендии " + (((70 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            }
            else{
                System.out.println("не возможно Сохранить степендию");
            }
            if (Bp >= 50 || Bp <= 100) {
                System.out.println("Для получения оценки B+ >=" + (((85 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку B+");
            }
            if (B >= 50 || B <= 100) {
                System.out.println("Для получения оценки B >=" + (((80 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку B");
            }
            if (Bm >= 50 || Bm <= 100) {
                System.out.println("Для получения оценки B- >= " + (((75 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку B-");
            }
            if (Cp >= 50 || Cp <= 100) {
                System.out.println("Для получения оценки C+ >=" + (((70 - (Total * 0.3)) * 100) / 40) + " % на файнале.");
            } else {
                System.out.println("не возможно получить оценку C+");
            }
            S.Grade_s( G_S_id, Student_ID, Subject_ID,RK1,RK2,St,A,Am,Bp,B,Bm);
           }
        else {
            System.out.println("Вы не допускаетесь на файнал");
        }



    }
}
