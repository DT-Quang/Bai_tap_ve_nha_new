package Buoi2;

import java.util.Scanner;

public class BTVN4 {
    public static void main(String[] args) {
        BTVN4 obj = new BTVN4();
        obj.menu();

    }
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Chào mừng đến với phần mềm máy tính của tôi : ");
        int dauVao=4; // mở máy
        for(; dauVao!=0;){
            System.out.println(" Bạn muốn sử dụng chức năng gì ? ");
            System.out.println(" Bấm 1 để xếp loại học sinh ");
            System.out.println(" Bấm 2 để kiểm tra tam giác ");
            System.out.println(" Bấm 3 để tính tiền điện ");
            System.out.println(" Bấm 0 ứng dụng ");
            dauVao=sc.nextInt();
            if(dauVao==0){
                dauVao=0;
                break;
            }
            if(dauVao==1){
                BTVN1 xepLoai = new BTVN1();
                xepLoai.main(null);
            }
            if(dauVao==2){
                BTVN2 tamGiac = new BTVN2();
                tamGiac.main(null);
            }
            if(dauVao==3){
                BTVN3 tienDien = new BTVN3();
                tienDien.main(null);
            }
        }
    }
}
