package Bai1;

import java.util.Scanner;
public class MAY {
    private static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public MAY(){

    }

    public MAY(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void NhapMay(){
        System.out.print("Nhap ma may       : ");
        maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap kieu may     : ");
        kieuMay = sc.nextLine();
        System.out.print("Nhap tinh trang   : ");
        tinhTrang = sc.nextLine();
    }
    public void XuatMay(){
        System.out.printf("%-10d%-10s%-20s",maMay,kieuMay,tinhTrang);
    }
}
