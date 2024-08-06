package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) {
        // 1. MySQL Driver Loading
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OK...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found....");
        }
        // 2. Connection
        String url = "jdbc:mysql://localhost:3306/smdb";
        String id = "smuser";
        String pwd = "111111";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("접속 성공!!!!");
        } catch (SQLException e) {
            System.out.println("접속 실패!!!!");
            e.printStackTrace();
        }
        // 3. Make SQL Statement
        String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(insertSql);
            pstmt.setString(1,"id10");
            pstmt.setString(2,"pwd10");
            pstmt.setString(3,"이말숙");
            pstmt.setString(4,"333222");

            //4. 전송
            pstmt.executeUpdate();
            System.out.println("Inserted Data .....");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        }finally {
            // 5. Close

            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        // 4. Transfer SQL Statement

    }
}
