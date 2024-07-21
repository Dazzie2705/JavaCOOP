/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.w3c3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Dazte
 */
public class Product {
    int PID;
    String PName;
    float Price;
    String Currency;
    int MYear;
    
    public Product (int ID, String PName, float Price, String Currency, int MYear){
        this.PID = ID;
        this.PName = PName;
        this.Price = Price;
        this.Currency = Currency;
        this.MYear = MYear;
    }
    
    public Product() {
        PID = 1;
        PName = "N/A";
        Price = 0;
        Currency = "N/A";
        MYear = 0000;
        
    }
    
    public void ProductNhap() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        PID = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap Ten SP: ");           
        PName = sc.nextLine();
        
        System.out.println("Nhap Gia Tien: ");           
        Price = Float.parseFloat(sc.nextLine());
        
        System.out.println("Nhap Menh gia: ");           
        Currency = sc.nextLine();
        
        System.out.println("Nhap Nam SX: ");           
        MYear = Integer.parseInt(sc.nextLine());

    }
    
    public void ProductXuat() {
        System.out.println("ID: " + PID + "; Name: " + PName + "; Price: " + Price + "; Menh gia: " + Currency + "; NamSX: " + MYear);
    }  
    
     public static void generateProducts(int count) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("Nhap thong tin cho san pham thu " + (i + 1) + ":");
            Product product = new Product();
            product.ProductNhap();
        }
    }
    
    public static Product HighestProduct() {
        if (products.isEmpty()) {
            return null;
        }
        
        Product highestPriceProduct = products.get(0);
        for (Product product : products) {
            if (product.Price > highestPriceProduct.Price) {
                highestPriceProduct = product;
            }
        }
        return highestPriceProduct;
    }
    
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong san pham: ");
        int count = Integer.parseInt(sc.nextLine());
        
        generateProducts(count);
        
        System.out.println("\nDanh sach san pham:");
        for (Product product : products) {
            product.ProductXuat();
        }
        
        Product highestPriceProduct = HighestProduct();
        if (highestPriceProduct != null) {
            System.out.println("\nSan pham co gia cao nhat:");
            highestPriceProduct.ProductXuat();
        } else {
            System.out.println("\nKhong co san pham nao.");
        }
    }
}
