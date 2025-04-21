import java.util.*;
import java.sql.*;


public class DBManager {

    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        String user = "postgres";
        String password = "Abcd1234";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("DBの接続が完了されました。");
        } catch (SQLException e) {
            System.out.println("DBの接続ができませんでした。");
        }
    }

    public static Connection getConnection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConnection'");
    }
    

}