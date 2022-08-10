package Bai2;

import java.util.Scanner;
public class RunMain {
    public static Scanner sc = new Scanner(System.in);

    public static Student[] delete(Student []sv, int k){
        Student[] newSV = new Student[sv.length-1];
        for(int i=0;i<sv.length-1;i++)
            newSV[i] = new Student();
        for(int i=0;i<k;i++)
            newSV[i] = sv[i];
        for(int i=k;i<sv.length-1;i++)
            newSV[i] = sv[i+1];
        return newSV;
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
        }while(n<=0);
        Student[] sv = new Student[n];
        for(int i=0;i<n;i++)
            sv[i] = new Student();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin sinh vien thu "+ (i+1));
            sv[i].Nhap();
            for(int j=0;j<i;j++){
                if(sv[j].getId() == sv[i].getId()) {
                    System.out.println("Ma SV da ton tai moi nhap lai");
                    sv[i].Nhap();
                }
            }
        }
        System.out.println("MENU");
        System.out.println("1. Hien thi thong cac sinh vien ra man hinh.");
        System.out.println("2. Tim kiem sinh vien theo id.");
        System.out.println("3. Sua province cac sinh vien Thanh Hoa thanh Hai Phong");
        System.out.println("4. Xoa sinh vien theo id.");
        int luaChon;
        do {
            System.out.print("Moi nhap lua chon: ");
            luaChon = sc.nextInt();
        }while (luaChon < 0 && luaChon > 5);
        switch (luaChon){
            case 1:{
                System.out.println("DANH SACH SINH VIEN");
                System.out.printf("%-10s%-20s%-10s%-15s%-20s%-10s","Id","Name","Age","Id address","District","Province");
                System.out.println();
                for(int i=0;i<n;i++)
                    sv[i].Xuat();
                break;
            }
            case 2:{
                System.out.print("Nhap ma sinh vien can tim: ");
                int id;
                id = sc.nextInt();
                System.out.printf("%-10s%-20s%-10s%-15s%-20s%-10s","Id","Name","Age","Id address","District","Province");
                System.out.println();
                for(int i=0;i<n;i++) {
                    if (sv[i].getId() == id)
                        sv[i].Xuat();
                    else
                        System.out.println("Khong tim thay sinh vien co ma sinh vien la " + id);
                }
                break;
            }
            case 3:{
                System.out.println("DANH SACH SINH VIEN SAU KHI DA THAY DOI");
                System.out.printf("%-10s%-20s%-10s%-15s%-20s%-10s","Id","Name","Age","Id address","District","Province");
                System.out.println();
                for(int i=0;i<n;i++){
                    if(sv[i].getAddress().getProvince().equals("Thanh Hoa"));
                        sv[i].getAddress().setProvince("Hai Phong");
                }
                break;
            }
            case 4:{
                System.out.print("Nhap ma sinh vien can xoa:");
                int id;
                id = sc.nextInt();
                for(int i=0;i<n;i++){
                    if(sv[i].getId() == id)
                        sv = delete(sv,i);
                }
                System.out.println("DANH SACH SINH VIEN SAU KHI XOA");
                System.out.printf("%-10s%-20s%-10s%-15s%-20s%-10s","Id","Name","Age","Id address","District","Province");
                System.out.println();
                for(int i=0;i<n-1;i++)
                    sv[i].Xuat();
                break;
            }
        }
    }
}
