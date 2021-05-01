/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package center.indus.Application.homeWindow;

/**
 *
 * @author Abdul Wahid
 */

import java.sql.*;
public class DataInserter {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement pst ;
    private String rollNo;
    private String name;
    private String father;
    private String fee;
    
    public DataInserter(String rollNo,String name, String father,String fee){
        this.rollNo = rollNo;
        this.name = name;
        this.father = father;
        this.fee = fee;
    }
    
    public void insertData(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
            String insertQurey = "insert into centertable (rollNo,s_name,f_name,fee) VALUES (?,?,?,?)";
            pst = connection.prepareStatement(insertQurey);
            pst.setString(1, rollNo);
            pst.setString(2, name);
            pst.setString(3, father);
            pst.setString(4, fee);
            pst.executeUpdate();
            
        } catch (Exception e) {
        }
    }
}
