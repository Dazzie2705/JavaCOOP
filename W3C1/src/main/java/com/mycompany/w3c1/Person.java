/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3c1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Person {
    int ID;
    String Name;
    String ADD;
    
    public Person (int ID, String Name, String ADD){
        this.ID = ID;
        this.Name = Name;
        this.ADD = ADD;
    }
    
    public Person() {
        ID = 1;
        Name = "N/A";
        ADD = "N/A";
    }
    
    public void PersonNhap() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        ID = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap Ho Ten: ");           
        Name = sc.nextLine();
        
        System.out.println("Nhap Dia Chi: ");           
        ADD = sc.nextLine();
    }
    
    public void PersonXuat(){
        System.out.println("I'm " + Name + ", hi folks!" + "t/" + "Here's also my ID and current address: " + ID + ", " + ADD );
        
    }  

}
