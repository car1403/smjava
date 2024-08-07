package dao;

import frame.DbFrame;
import frame.Sql;
import vo.Cust;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustDao extends DbFrame {

    // 1. select
    public ArrayList<Cust> select(){
        return null;
    }

    // 2. select one
    public Cust select(String id) {
        return null;
    }

    // 3. insert
    public void insert(Cust cust){
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(Sql.insetCust);
            pstmt.setString(1,cust.getId());
            pstmt.setString(2,cust.getPwd());
            pstmt.setString(3,cust.getName());
            pstmt.setString(4,cust.getAcc());

            //4. 전송
            pstmt.executeUpdate();
            System.out.println("Inserted Data .....");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        }finally {
            close(pstmt);
            close(con);
        }
    }
    // 4. delete
    public void delete(String id){

    }
    // 5. update
    public void update(Cust cust){

    }
}







