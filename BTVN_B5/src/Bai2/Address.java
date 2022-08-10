package Bai2;

import com.sun.nio.sctp.NotificationHandler;

import java.util.Scanner;

public class Address {
    private static Scanner sc = new Scanner(System.in);
    private int id;
    private String district;
    private String province;

    public Address(){

    }
    public Address(int id, String district, String province) {
        this.id = id;
        this.district = district;
        this.province = province;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Address.sc = sc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void Nhap() {
        System.out.print("Nhap id Address   : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap huyen        : ");
        district = sc.nextLine();
        System.out.print("Nhap province     : ");
        province = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-15d%-20s%-20s",id,district,province);
    }
}
