package SQL1;

import Utils.ConfigReader;

import java.sql.*;

public class E2SQL {
    public static void main(String[] args) {
        String dbUrl=ConfigReader.getProperty("dbUrl");
        String userName=ConfigReader.getProperty("dbUserName");
        String password=ConfigReader.getProperty("dbPassword");
        try {
            Connection connection= DriverManager.getConnection(dbUrl,userName,password);
            Statement statement=connection.createStatement();
            String query="select* from employee";
            //executes the query and stores the results in resultSet variable
            ResultSet rs=statement.executeQuery(query);
            //information about the data for example number of columns, their names, datatypes etc.
            ResultSetMetaData rsmd=rs.getMetaData();
            //gives us the number of columns in the resultSet
            int columnCount=rsmd.getColumnCount();
            for (int i = 1; i <=columnCount; i++) {
                //so its a good practice to use Label just not to get confuse in case if query used "as"
                System.out.print(rsmd.getColumnLabel(i)+" ");
            }
            System.out.println();
            //while loop goes through the rows
            while (rs.next()){
                //it goes through the column
                for (int i = 1; i <=columnCount ; i++) {
                    System.out.print(rs.getString(i)+" ");
                }
                System.out.println();
            }
            System.out.println(rsmd.getColumnCount());
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
