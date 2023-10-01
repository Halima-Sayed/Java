package SQL1;

import Utils.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E3SQL {
    public static void main(String[] args) {
        String dbUrl = ConfigReader.getProperty("dbUrl");
        String userName = ConfigReader.getProperty("dbUserName");
        String password = ConfigReader.getProperty("dbPassword");
        List<Map<String, String>> empMapList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, userName, password);
            Statement statement = connection.createStatement();
            String query = "select* from employee";
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            while (rs.next()) {
                HashMap<String, String> rowMap = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String key = rsmd.getColumnName(i);
                    String value = rs.getString(i);
                    rowMap.put(key, value);
                }
                empMapList.add(rowMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Map<String, String> empMap : empMapList) {
            System.out.println(empMap);
        }
    }
}
