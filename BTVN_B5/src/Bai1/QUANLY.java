package Bai1;

import java.util.Scanner;
public class QUANLY {
    private static Scanner sc = new Scanner(System.in);
    private int maQL;
    private String hoTen;

    public QUANLY(){

    }
    public QUANLY(int maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public int getMaQL() {
        return maQL;
    }

    public void setMaQL(int maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void NhapQL(){
        System.out.print("Nhap ma QL    : ");
        maQL = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten   : ");
        hoTen = sc.nextLine();
    }
    public void XuatQL(){
        System.out.printf("%-10d%-30s",maQL,hoTen);
    }
}
