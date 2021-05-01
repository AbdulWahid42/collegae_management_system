/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package center.indus.Application;

/**
 *
 * @author Abdul Wahid
 */
import center.indus.Application.homeWindow.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.Hashtable;
public class DataFetcher {
    
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private ArrayList studentsData;
    private String qurey;
    private Hashtable studentHashtable;
    
    public DataFetcher(String tableName){
        studentsData = new ArrayList();
        studentHashtable = new Hashtable();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
            statement = connection.createStatement();
            qurey = "SELECT * FROM "+tableName;
            resultSet = statement.executeQuery(qurey);
            
            while(resultSet.next()){
                
                studentsData.add(new Student(resultSet.getString(1),resultSet.getString(2),
                                            resultSet.getString(3),resultSet.getString(4)));
                studentHashtable.put(resultSet.getString(1), new Student(resultSet.getString(1),resultSet.getString(2),
                                            resultSet.getString(3),resultSet.getString(4)));
            }
        }
        catch (Exception e) {
        }
    }
    
    public ArrayList studentData(){
        return studentsData;
    }
    
    public Hashtable studentHashData(){
        return studentHashtable;
    }
}
