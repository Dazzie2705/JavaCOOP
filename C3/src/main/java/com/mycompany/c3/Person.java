/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Person {
    int ID;
    String Name;
    String ADD;
    
   /* public Student (int ID, String Ten){
        this.MSSV = ID;
        this.Name = Ten;
    }
    
    public Student() {
        MSSV = 1;
        Name = "N/A";
    }
    */
    public void SVNhap() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        ID = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap Ho Ten: ");           
        Name = sc.nextLine();
        
        System.out.println("Nhap Dia Chi: ");           
        ADD = sc.nextLine();
    }
    
    public void SVXuat(){
        System.out.println("I'm " + Name + ", hi folks! My ID is: " + ID + " along with my adress: " + ADD);
    }  

}
