/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobabuatclass;

/**
 *
 * @author user
 */
public class Student extends Person {
    private String studentId;
 
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
 
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
 
    public String getStudentId() {
        return studentId;
    }
}
