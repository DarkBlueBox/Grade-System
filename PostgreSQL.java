package kz.aitu.oop.project;


import java.sql.*;

public class PostgreSQL extends Students implements Connect {

    String url = "jdbc:postgresql://localhost:5432/Grading System?currentSchema=public";
    String user = "postgres";
    String password = "POGO988009";


    public Connection connect(String URL, String User, String Password) {
        String url = "jdbc:postgresql://localhost:5432/Grading System?currentSchema=public";
        String user = "postgres";
        String password = "POGO988009";

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


    public String ExecSQL(String sql, String[] params) {

        try {

           Connection connection = DriverManager.getConnection(url, user, password) ;
                PreparedStatement statements1 = connection.prepareStatement(sql);
//            statements1.setInt(1, ID);
//            statements1.setString(2, FirstName);
//            statements1.setString(3, LastName);
//
//            PreparedStatement statements1 = connection.prepareStatement(sql);
//            statements1.addBatch();
//            statements1.executeBatch();
//            PreparedStatement  statements2 = connection.prepareStatement(sql);

            ResultSet rs = statements1.executeQuery();
            {

                while (rs.next()) {
                    String Grade = rs.getString(2);
                    System.out.println("Для получения оценки " + Grade);
                }


                statements1.close();
//                statements2.close();
//                statements4.close();


            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;


    }
}

