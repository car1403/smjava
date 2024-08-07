package test;

import dao.CustDao;
import vo.Cust;

import java.sql.SQLException;

public class UpdateCust {
    public static void main(String[] args) {
        CustDao custDao = new CustDao();
        Cust cust = new Cust("id91","91","홍말숙","9911");

        try {
            custDao.update(cust);
            System.out.println("정상 수정");
        } catch (SQLException e) {
            System.out.println("수정 오류");
        }
    }
}
