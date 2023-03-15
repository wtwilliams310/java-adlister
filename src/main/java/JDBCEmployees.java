import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployees {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();


        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from employees LIMIT 10");

            while(rs.next()){
                arraylist.add(rs.getString("first_name"));
//                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
            }
            System.out.println(arraylist);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
