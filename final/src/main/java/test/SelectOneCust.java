package test;

import dao.CustDao;
import vo.Cust;

import java.sql.SQLException;

public class SelectOneCust {
    public static void main(String[] args) {
        CustDao custDao = new CustDao();
        Cust cust = null;

        try {
            cust = custDao.select("id01");
            System.out.println(cust);
        } catch (SQLException e) {
            System.out.println("입력 오류");
        }
    }
}
