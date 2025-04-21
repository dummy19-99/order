import java.sql.*;

public class main {
    public static void main(String[] args) {

        System.out.println("--------商品リスト--------");
        System.out.println();

        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        String user = "postgres";
        String password = "Abcd1234";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("1　キーボード　3000");
            System.out.println("2　マウス　1500");
            System.out.println("3　モニター　12000");
            System.out.println("4　スピーカー　4500");
        } catch (SQLException e) {
            System.out.println("DBの接続ができませんでした。");
        }

    }


}
