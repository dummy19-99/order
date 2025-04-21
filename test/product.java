import java.util.*;
import java.sql.*;

public class product {
    int id;
    String name;
    int price;

    public product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
    String user = "postgres";
    String password = "Abcd1234";

    public int getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }

    /*
    System.out.println("id" +  "name" + "price");
    */

    try {
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("DBの接続が完了されました。");
    } catch (SQLException e) {
        System.out.println("DBの接続ができませんでした。");
    }

}