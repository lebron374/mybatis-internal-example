package cn.edu.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author: virgil
 * @Date; 2020/5/16 11:19 上午
 * @Version: 1.0
 **/
public class JdbcTest {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection("")) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery("")) {
                    if (resultSet.next()) {
                        resultSet.getInt(1);
                    }
                    // TODO 资源关系
                }
            }
        }

    }

}
