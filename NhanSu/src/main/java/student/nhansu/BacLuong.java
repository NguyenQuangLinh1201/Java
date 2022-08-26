/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.nhansu;

import java.io.Serializable;
import java.util.Scanner;

public class BacLuong implements Serializable{
    private Scanner sc = new Scanner(System.in);
    private int bac;

    public BacLuong(int bac) {
        super();
        this.bac = bac;
    }
    
    public BacLuong(){
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
    public void NhapBacLuong(){
        System.out.print("Nhap bac luong: ");
        do{
            bac = sc.nextInt();
            if(bac<1 || bac>4)  
                System.out.print("Nhap lai bac luong: ");
        }while(bac<1 || bac>4);
    }
    public void XuatBacLuong(){
        System.out.printf("%-10d",bac);
    }
}
