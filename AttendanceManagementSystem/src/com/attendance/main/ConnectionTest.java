package com.attendance.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.attendance.util.DatabaseConnection;

public class ConnectionTest {

    public static void main(String[] args) {

        try (Connection connection =
                DatabaseConnection.getConnection();

             Statement statement =
                connection.createStatement();

             ResultSet resultSet =
                statement.executeQuery(
                    "SELECT datname FROM pg_database ORDER BY datname"
                )) {

            System.out.println("PostgreSQLへの接続に成功しました！");
            System.out.println("Javaから見えているデータベース一覧");

            while (resultSet.next()) {

                System.out.println(
                    resultSet.getString("datname")
                );
            }

        } catch (SQLException e) {

            System.out.println("PostgreSQLへの接続に失敗しました。");

            e.printStackTrace();
        }
    }
}