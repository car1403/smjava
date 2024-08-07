package myjdbc;

import java.sql.*;

public abstract class DbFrame {
    // 2. Connection
    String url = "jdbc:mysql://localhost:3306/smdb";
    String id = "smuser";
    String pwd = "111111";

    public DbFrame(){
        // 1. MySQL Driver Loading
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OK...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found....");
        }
    }

    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, id, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  con;
    }

    public void close(Connection con){

        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void close(ResultSet rset){
        if(rset != null){
            try {
                rset.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void close(PreparedStatement pstmt){
        if(pstmt != null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
