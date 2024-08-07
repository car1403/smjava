package frame;

public class Sql {
    public static String insetCust = "INSERT INTO cust VALUES (?,?,?,?)";
    public static String deleteCust = "DELETE FROM cust WHERE id = ?";
    public static String updateCust = "UPDATE cust SET pwd=?, name=?, acc=? WHERE id = ? ";
    public static String selectCust = "SELECT * FROM cust";
    public static String selectOneCust = "SELECT * FROM cust WHERE id = ?";
}
