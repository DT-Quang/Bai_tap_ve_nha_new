package Buoi9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String id ;
    private String name ;
    private Double score ;


    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập họ tên sinh viên : ");
        this.name = sc.nextLine();
        System.out.println(" Nhập mã sinh viên : ");
        this.id = sc.nextLine();
        System.out.println(" Nhập điểm thi : ");
        this.score = sc.nextDouble();
    }

    public void hienThiThongTin(){
        System.out.println("====================");
        System.out.println(" Họ tên sinh viên " + name);
        System.out.println(" Mã sinh viên " + id);
        System.out.println(" Điểm của sinh viên " + score);
        System.out.println("====================");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
