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
public class EncapTest {
    public static void main(String args[]){
        EncapDemo encap = new EncapDemo();
        encap.setName("Indah");
        encap.setAge(17);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        
        encap.setName("Retno");
        encap.setAge(35);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        
        encap.setName("Riani");
        encap.setAge(19);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}
