package dao;

import frame.DbFrame;
import frame.Sql;
import vo.Cust;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustDao extends DbFrame {

    // 1. select
    public ArrayList<Cust> select() throws SQLException {
        ArrayList<Cust> list = new ArrayList<>();

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(Sql.selectCust);
            //4. 전송
            rset = pstmt.executeQuery();
            // 5. 결과 출력
            while(rset.next()){
                String custId = rset.getString("id");
                String custPwd = rset.getString("pwd");
                String custName = rset.getString("name");
                String custAcc = rset.getString("acc");
                Cust cust = new Cust(custId, custPwd, custName, custAcc);
                list.add(cust);
            }

        } catch (SQLException e) {
            throw e;
        }finally {
            close(rset);
            close(pstmt);
            close(con);
        }
        return list;
    }

    // 2. select one
    public Cust select(String id) throws SQLException {
        Cust cust = null;

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(Sql.selectOneCust);
            pstmt.setString(1,id);
            //4. 전송
            rset = pstmt.executeQuery();
            rset.next();
            String custId = rset.getString("id");
            String custPwd = rset.getString("pwd");
            String custName = rset.getString("name");
            String custAcc = rset.getString("acc");
            cust = new Cust(custId, custPwd, custName, custAcc);

        } catch (SQLException e) {
           throw e;
        }finally {
            close(rset);
            close(pstmt);
            close(con);
        }


        return cust;
    }

    // 3. insert
    public void insert(Cust cust) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(Sql.insetCust);
            pstmt.setString(1,cust.getId());
            pstmt.setString(2,cust.getPwd());
            pstmt.setString(3,cust.getName());
            pstmt.setString(4,cust.getAcc());

            pstmt.executeUpdate();
            System.out.println("Inserted Data .....");
        } catch (SQLException e) {
            throw e;
        }finally {
            close(pstmt);
            close(con);
        }
    }
    // 4. delete
    public void delete(String id) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(Sql.deleteCust);
            pstmt.setString(1,id);

            pstmt.executeUpdate();
            System.out.println("Updated Data .....");
        } catch (SQLException e) {
            throw e;
        }finally {
            close(pstmt);
            close(con);
        }
    }
    // 5. update
    public void update(Cust cust) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(Sql.updateCust);

            pstmt.setString(1,cust.getPwd());
            pstmt.setString(2,cust.getName());
            pstmt.setString(3,cust.getAcc());
            pstmt.setString(4,cust.getId());

            pstmt.executeUpdate();
            System.out.println("Updated Data .....");
        } catch (SQLException e) {
            throw e;
        }finally {
            close(pstmt);
            close(con);
        }
    }
}







