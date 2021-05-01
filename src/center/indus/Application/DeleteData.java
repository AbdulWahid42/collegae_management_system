/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package center.indus.Application;

import java.sql.*;
public class DeleteData {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public void delete(String rollNo){
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
            statement = connection.createStatement();
            String query = "DELETE FROM centerTable WHERE rollNo = "+rollNo;
            resultSet = statement.executeQuery(query);
            
        } catch (Exception e) {
        }
    }
}
