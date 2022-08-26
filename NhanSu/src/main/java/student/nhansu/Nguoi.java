/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.nhansu;

import java.io.Serializable;
import java.util.Scanner;

public class Nguoi implements Serializable{
    public static Scanner sc = new Scanner(System.in);
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;

    public Nguoi(){
    }
    
    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        super();
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void NhapNguoi(){
        System.out.print("Nhap ho ten   : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
    }
    
    public void XuatNguoi(){
        System.out.printf("%-20s%-20s%-10s",hoTen,ngaySinh,gioiTinh);
    }
}
