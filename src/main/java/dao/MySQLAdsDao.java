package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;
import models.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    Config config = new Config();


    {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";


        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            List<Ad> ads = new ArrayList<>();

            while (rs.next()){
                ads.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        Long key = 0L;
        try {
            String INSERT_QUERY = "INSERT INTO ADS(USER_ID, TITLE, DESCRIPTION) VALUES(?,?,?)";

            PreparedStatement ps = connection.prepareStatement(INSERT_QUERY);
            ps.setLong(1, ad.getUserId());
            ps.setString(2, ad.getTitle());
            ps.setString(3, ad.getDescription());

            int count = ps.executeUpdate();
            if(count == 0) {
                System.out.println("Record not submitted");
            } else {
                System.out.println("Record Stored into Database");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return key;
    }
}
