/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.nhansu;

import java.util.Scanner;
import java.util.ArrayList;

public class RunMain {

    private static void showMenu() {
        System.out.println("--------MENU--------");
        System.out.println("1. Nhap thong tin nhan vien");
        System.out.println("2. Hien thi thong tin cac nhan vien");
        System.out.println("3. Tim nhan vien theo ma nhan vien");
        System.out.println("4. Thoat khoi chuong trinh");
        System.out.println("----------------------------------------");
        System.out.print("Moi nhap lua chon: ");
    }
   
    public static Stream streams = new Stream();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<NhanSu> listNhanSu = new ArrayList<>();
        int choose;
        showMenu();
        while(true){
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    add(listNhanSu);
                    break;
                case 2:
                    show(listNhanSu);
                    break;
                case 3:
                    find(listNhanSu);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Moi nhap lai lua chon!");
            }
            showMenu();
        }
    }
    
    public static void add(ArrayList<NhanSu> listNhanSu){
        NhanSu a = new NhanSu();
        a.Nhap();
        listNhanSu.add(a);
        streams.write(listNhanSu);
    }
    
    public static void show(ArrayList<NhanSu> listNhanSu){
        System.out.println("DANH SACH NHAN VIEN");
        System.out.printf("%-20s%-20s%-10s%-10s%-15s%-20s%-10s","Ho ten","Ngay sinh","Gioi tinh","Ma NV","So CCCD","Nganh nghe","Bac luong");
        System.out.println();
        for(NhanSu ns:listNhanSu)
            ns.Xuat();
    }
    
    public static void find(ArrayList<NhanSu> listNhanSu){
        //listNhanSu = streams.read();
        System.out.print("Nhap ma NV muon tim kiem: ");
        String maNV = sc.nextLine();
        int d=0;
        for(int i=0;i<listNhanSu.size();i++){
            if(listNhanSu.get(i).getMaNV().compareTo(maNV)==0){
                System.out.printf("%-20s%-20s%-10s%-10s%-15s%-20s%-10s","Ho ten","Ngay sinh","Gioi tinh","Ma NV","So CCCD","Nganh nghe","Bac luong");
                listNhanSu.get(i).Xuat();
                d++;
            }
        } 
        if(d==0)
            System.out.println("Khong tim thay ma nhan vien " + maNV);
    }
}
