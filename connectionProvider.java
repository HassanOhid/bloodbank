/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import static java.lang.Class.forName;
import java.sql.*;

public class connectionProvider {
    public static Connection getCon()
    {
    try{
         class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbs","root","123456789");
      return con;
    }
    catch(Exception e)
    {
    
    return null;
    }
    
    }
    
    
    
}
