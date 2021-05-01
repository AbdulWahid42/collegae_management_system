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
public class Student{
    private String rollNo;
    private String name ;
    private String father;
    private String fee;
    
    public Student(String rollNo,String name, String father,String fee){
        this.rollNo = rollNo;
        this.name = name;
        this.father = father;
        this.fee = fee;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getFather() {
        return father;
    }

    public String getFee() {
        return fee;
    }
    
    
}

