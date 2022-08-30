/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package testpanel.com.qlthuongsv;

/**
 *
 * @author Win 10 Pro
 */
public class Student {
    private String studentID,name,major;
    private float mark;
    private String gioiTinh;
    
    public Student() {
    }

    public Student(String studentID, String name, String major, float mark, String gioiTinh) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.mark = mark;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    

    public String getCapacity(){
        if(mark>9) return "Xuat sac";
        return "Gioi";
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    
}
