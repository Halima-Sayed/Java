package SQL1;


import java.sql.*;

public class E1SQL {
    public static void main(String[] args) {
        //At work the person who will have all this info =Database administrator DBA
        //JDBC is an API that allows Java programs to connect to and access databases.
        //mysql:MySQL is a relational database management system.
        //ip: Internet Protocol address.
       String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
       String userName="syntax_hrm";
       String password="syntaxhrm123";
       //connection is an interface. drivermanager is a class, getconnection is a method
        //we need to create connection to connect to the database first
        try {
            Connection connection= DriverManager.getConnection(dbUrl,userName,password);
            //Statement= will take your queries execute on the database and brings the results back
            Statement statement=connection.createStatement();
            String query="select* from person";
            //ResultSet contains the results of the query that we execute on the database in the for of a table
            ResultSet resultSet=statement.executeQuery(query);
            //will keep returning in resultset as long as it is true
            while (resultSet.next()){
                String firstName=resultSet.getString("FirstName");
                int age=resultSet.getInt("age");
                String city=resultSet.getString("City");
                System.out.println(firstName+" "+age+" "+city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
