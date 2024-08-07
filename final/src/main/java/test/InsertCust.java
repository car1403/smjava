package test;

import dao.CustDao;
import vo.Cust;

import java.sql.SQLException;

public class InsertCust {
    public static void main(String[] args) {
        CustDao custDao = new CustDao();
        Cust cust = new Cust("id91","pwd91","이말숙","9999");

        try {
            custDao.insert(cust);
            System.out.println("정상 입력");
        } catch (SQLException e) {
            System.out.println("입력 오류");
        }
    }
}
