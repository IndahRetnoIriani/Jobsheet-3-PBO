/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncapsulasiJ3T1;

/**
 *
 * @author TOSHIBA
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
       if(newAge <= 18 || newAge >= 30){
           age = 0;
           System.out.println("Umur minimal adalah 18 tahun dan Umur maksimal adalah 30 tahun!");      
        } else {
            age = newAge;
        }      
    }
}
