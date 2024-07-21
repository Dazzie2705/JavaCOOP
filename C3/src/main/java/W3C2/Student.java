/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package W3C2;
import java.util.Scanner;
/**
 *
 * @author admin
 */

public class Student {
    int MSSV;
    String Name;
    
    public Student (int ID, String Ten){
        this.MSSV = ID;
        this.Name = Ten;
    }
    
    public Student() {
        MSSV = 1;
        Name = "N/A";
    }
    
    public void SVNhap() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MSSV: ");
        MSSV = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhap Ho Ten: ");           
        Name = sc.nextLine();
    }
    
    public void SVXuat(){
        System.out.println("Ten: " + Name + ", MSSV: " + MSSV);
    }  

}
