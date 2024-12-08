package Buoi2;

import LessonContent.Switch_Case;

import java.util.Scanner;

public class BTVN5 {
    public Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BTVN5 obj = new BTVN5();
        obj.kiemTra();
    }
    public void kiemTra(){
        System.out.println("Nhập vào năm cần kiểm tra ");
        int nam = sc.nextInt();
        System.out.println(" Nhập vào tháng cần kiểm tra ");
        int thang = sc.nextInt();
        switch (thang){
            case 1,3,5,7,8,10,12:{
                System.out.println("Tháng này có 31 ngày ");
                break;
            }
            case 4,6,9,11:{
                System.out.println("Tháng này có 30 ngày ");
                break;
            }
            case 2:{
                if((nam%4==0 && nam%100!=0) || (nam%400==0)){
                    System.out.println(" Đây là năm nhuận tháng 2 có 29 ngày ");
                }
                else{
                    System.out.println(" Đây không phải năm nhuận tháng 2 có 28 ngày ");
                }
                break;
            }
            default:{
                System.out.println(" Nhập sai dữ liệu ");
            }
        }

    }
}
