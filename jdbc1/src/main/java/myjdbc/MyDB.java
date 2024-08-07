package myjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyDB extends DbFrame{
    public ArrayList<Cust> select(){
        ArrayList<Cust> list = null;
        // 3. Make SQL Statement
        String selectSql = "SELECT * FROM cust";
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        Connection con = getConnection();
        try {
            pstmt = con.prepareStatement(selectSql);
            //4. 전송
            rset = pstmt.executeQuery();
            // 5. 결과 출력
            while(rset.next()){
                String custId = rset.getString("id");
                String custPwd = rset.getString("pwd");
                String custName = rset.getString("name");
                String custAcc = rset.getString("acc");
                System.out.printf("%s %s %s %s \n",custId, custPwd, custName,custAcc);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        }finally {
            close(rset);
            close(con);
        }
        return list;
    }
}
