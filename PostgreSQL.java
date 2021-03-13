package kz.aitu.oop.project;


import java.sql.*;

public class PostgreSQL extends Students implements Connect {

    String url = "jdbc:postgresql://localhost:5432/Grading System?currentSchema=public";
    String user = "postgres";//Connection to DBMS
    String password = "POGO988009";//Connection to DBMS


    public Connection connect(String URL, String User, String Password) {
        String url = "jdbc:postgresql://localhost:5432/Grading System?currentSchema=public";
        String user = "postgres";//Connection to DBMS
        String password = "POGO988009";//Connection to DBMS

        try {
            Connection connect = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL server");
            connect.close();


        } catch (SQLException e) {
            System.out.println("Error in connecting to PostgreSQL server");
            e.printStackTrace();
        }

        return null;
    }


    public String ExecSQL(String sql) {

        try {

            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statements1 = connection.prepareStatement(sql);

            statements1.setInt(1, Student_ID);
            statements1.setString(2, FirstName);
            statements1.setString(3, LastName);
            statements1.execute();

            statements1.close();




        }



        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

//    public Object Check(int Student_ID) {
//        try {
//
//            String sql = "Select * From Student where Student_id =Student_ID";
//            Connection connection = DriverManager.getConnection(url, user, password);
//            PreparedStatement statements1 = connection.prepareStatement(sql);
//            ResultSet rs = statements1.executeQuery();
//            {
//
//                if(rs.next()) {
//
//
//                    System.out.println("Студент уже занесен в базу данных ,желаете внести изменения: да = Da , нет = Net");
//                }//If the values are the same, then you answer either yes or no
//                else{
//                    System.out.println(" ");
//                }
//
//                statements1.close();
//
//
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return null;
//    }


//    public Object Out (int Student_ID) {
//        try {
//            String sql = "Select * From Student where Student_id =Student_ID";
//            Connection connection = DriverManager.getConnection(url, user, password);
//            PreparedStatement statements1 = connection.prepareStatement(sql);
//            ResultSet rs = statements1.executeQuery();
//            {
//
//                if (rs.next()) {
//
//                    System.out.println("Студент уже занесен в базу данных ,желаете внести изменения: да = ++ , нет = --");
//                }
//
//                statements1.close();
//
//
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return null;
//    }
//    public Object G_S(int G_S_id){
//
//        try{
//            Connection connection = DriverManager.getConnection(url, user, password);
//           String sql="INSERT INTO student_grade(s_g_id) VALUES (?)";
//            PreparedStatement statements2 = connection.prepareStatement(sql);
//            statements2.setInt(1, G_S_id);
//            statements2.execute();
//            statements2.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//        public Object Students_grade ( int Student_ID, int Subject_ID){
//
//           try {
//                Connection connection = DriverManager.getConnection(url, user, password);
//
//                String Sql1 = "Insert Into Student_grade (Student_id,Subject_id) Values(?,?)  ";
//               PreparedStatement statements0 = connection.prepareStatement(Sql1);
//               statements0.setString(1, Student_ID);
//               statements0.setString(2, Subject_ID);
//               statements0.execute();
//                statements0.close();
//
//            }
//            catch (SQLException throwables) {
//               throwables.printStackTrace();
//           }
//            return null;
//
//
//       }

    public Object Grade_s(int G_S_id, int Student_ID, int Subject_ID, double RK1, double RK2, double St, double A,
                          double Am, double Bp, double B, double Bm) {
        try {

            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO student_grade(s_g_id,Student_id,Subject_ID,RK_1,RK_2,Stependia,Grade_A,Grade_A_M,Grade_B_P,Grade_B,Grade_B_M) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statements3 = connection.prepareStatement(sql);
            statements3.setDouble(1, G_S_id);
            statements3.setDouble(2, Student_ID);
            statements3.setDouble(3, Subject_ID);
            statements3.setDouble(4, RK1);
            statements3.setDouble(5, RK2);
            statements3.setDouble(6, St);
            statements3.setDouble(7, A);
            statements3.setDouble(8, Am);
            statements3.setDouble(9, Bp);
            statements3.setDouble(10, B);
            statements3.setDouble(11, Bm);


            statements3.execute();
            statements3.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public Object UPdate( int Subject_ID, double RK1, double RK2, double St, double A, double Am, double Bp, double B, double Bm) {
        try {
//                RK_1,RK_2, St,A, Am, Bp, B, Bm,Cp
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "UPDATE student_grade SET Subject_ID=?,RK_1=?,RK_2=?,Stependia=?,Grade_A=?,Grade_A_M=?,Grade_B_P=?,Grade_B=?,Grade_B_M=?  WHERE s_g_id=Student_id";
//                Statement statements3 = connection.createStatement();
            PreparedStatement statements4 = connection.prepareStatement(sql);

            statements4.setDouble(1, Subject_ID);
            statements4.setDouble(2, RK1);
            statements4.setDouble(3, RK2);
            statements4.setDouble(4, St);
            statements4.setDouble(5, A);
            statements4.setDouble(6, Am);
            statements4.setDouble(7, Bp);
            statements4.setDouble(8, B);
            statements4.setDouble(9, Bm);


            statements4.executeUpdate();
            statements4.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}

