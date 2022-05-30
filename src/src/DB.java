
package src;

import java.sql.*;
public class DB {
    
    static Connection con = null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smsys","smsys","666999");
            
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
}
