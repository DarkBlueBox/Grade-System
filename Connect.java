package kz.aitu.oop.project;

import java.sql.Connection;
import java.sql.SQLException;

public interface Connect {
    public Connection connect (String url, String user, String password) throws SQLException;
    public String ExecSQL(String sql) throws SQLException ;
}
