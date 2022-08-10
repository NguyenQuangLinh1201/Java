package Bai1;

import java.util.Scanner;
public class PHONGMAY {
    private static Scanner sc = new Scanner(System.in);
    private int maPhong;
    private String tenPhong;
    private double dienTich;
    private QUANLY x =  new QUANLY();
    private MAY y = new MAY();

    public PHONGMAY(){

    }
    public PHONGMAY(int maPhong, String tenPhong, double dienTich, QUANLY x, MAY y) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QUANLY getX() {
        return x;
    }

    public void setX(QUANLY x) {
        this.x = x;
    }

    public MAY getY() {
        return y;
    }

    public void setY(MAY y) {
        this.y = y;
    }

    public void Nhap(){
        System.out.print("Nhap ma phong may     : ");
        maPhong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten phong may    : ");
        tenPhong = sc.nextLine();
        System.out.print("Nhap dien tich phong  : ");
        dienTich = sc.nextDouble();
        sc.nextLine();
        x.NhapQL();
        y.NhapMay();
    }
    public void Xuat(){
        System.out.println("THONG TIN PHONG MAY");
        System.out.printf("%-10s%-15s%-15s%-10s%-30s%-10s%-10s%-20s","Ma phong","Ten phong","Dien tich","Ma QL","TenQL","Ma may","Kieu may","Tinh trang");
        System.out.println();
        System.out.printf("%-10d%-15s%-15f",maPhong,tenPhong,dienTich);
        x.XuatQL();
        y.XuatMay();
    }
}
