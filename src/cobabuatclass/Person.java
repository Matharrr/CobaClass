/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobabuatclass;

/**
 *
 * @author user
 */
public class Person {
    private String name;
    private int age;
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public int getAge() {
        return age;
    }
}

