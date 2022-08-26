/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package student.nhansu;

import java.util.Scanner;
import java.io.Serializable;

public class NhanSu extends Nguoi implements NganhNghe,Serializable{
    private String maNV,CCCD,nganhNghe;
    private BacLuong x = new BacLuong();
    private BacLuong bacLuong;

    public NhanSu(String maNV, String CCCD, String nganhNghe, String hoTen, String ngaySinh, String gioiTinh) {
        super(hoTen, ngaySinh, gioiTinh);
        this.maNV = maNV;
        this.CCCD = CCCD;
        this.nganhNghe = nganhNghe;
    }
    
    public NhanSu(){
    
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public BacLuong getBacLuong() {
        BacLuong bacLuong = null;
        return bacLuong;
    }

    public void setBacLuong(BacLuong bacLuong) {
        this.bacLuong = bacLuong;
    }
    
    @Override
    public void NhapNganhNghe() {
        System.out.print("Nhap nganh nghe: ");
        nganhNghe = sc.nextLine();
    }

    @Override
    public void XuatNganhNghe() {
        System.out.printf("%-20s",nganhNghe);
    }
    
    public void Nhap(){
        super.NhapNguoi();
        System.out.print("Nhap ma NV: ");
        maNV = sc.nextLine();
        System.out.print("Nhap so CCCD: ");
        CCCD = sc.nextLine();
        NhapNganhNghe();
        x.NhapBacLuong();
    }
    
    public void Xuat(){
        super.XuatNguoi();
        System.out.printf("%-10s%-15s%-20s",maNV,CCCD,nganhNghe);
        x.XuatBacLuong();
        System.out.println();
    }
    
}
