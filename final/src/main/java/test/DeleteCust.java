package test;

import dao.CustDao;
import vo.Cust;

import java.sql.SQLException;

public class DeleteCust {
    public static void main(String[] args) {
        CustDao custDao = new CustDao();

        String id = "id90";
        try {
            custDao.delete(id);
            System.out.println("정상 삭제");
        } catch (SQLException e) {
            System.out.println("삭제 오류");
        }
    }
}
