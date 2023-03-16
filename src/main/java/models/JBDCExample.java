package models;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JBDCExample {
    public static void main(String[] args) {
        try {

            // register driver
            DriverManager.registerDriver(new Driver());

            //make the connection

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            ); //<---can still throw an exception

            System.out.println(connection); // <--- Test connection

            // create a statement

            Statement statement = connection.createStatement();

            // run query with statement and parse result set

            String query = "select * from albums";

            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
                String artist = rs.getString("artists");
                if (artist.equals("Nirvana"))
                {
                    System.out.println(rs.getString("name"));}
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
