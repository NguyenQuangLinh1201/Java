package Bai2;

import java.util.Scanner;
public class Student {
    private static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    private Address address = new Address();

    public Student(){

    }

    public Student(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Student.sc = sc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void Nhap(){
        System.out.print("Nhap id student: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap age: ");
        age = sc.nextInt();
        sc.nextLine();
        address.Nhap();
    }

    public void Xuat(){
        System.out.printf("%-10d%-20s%-10s",id,name,age);
        address.Xuat();
        System.out.println();
    }

}
