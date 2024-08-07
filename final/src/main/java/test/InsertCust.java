package test;

import dao.CustDao;
import vo.Cust;

public class InsertCust {
    public static void main(String[] args) {
        CustDao custDao = new CustDao();
        Cust cust = new Cust("id90","pwd90","이말숙","9999");

        custDao.insert(cust);
    }
}
