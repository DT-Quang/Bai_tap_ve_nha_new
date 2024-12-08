package Practice;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chào mừng đến với phần mềm máy tính của tôi");
        int dauVao= 5; // mở máy tính
        for ( ; dauVao != 0; ){
            System.out.println("Bạn muốn thực hiện phép tính gì?");
            System.out.println("1: Phép cộng");
            System.out.println("2: Phép trừ");
            System.out.println("3: Phép nhân");
            System.out.println("4: Phép chia");
            System.out.println("0: Tắt máy tính");
            dauVao = sc.nextInt();
            if(dauVao == 0){
                dauVao = 0;
                break;
            }
            System.out.println("Nhập giá trị a: ");
            int a = sc.nextInt();
            System.out.println("Nhập giá trị b: ");
            int b = sc.nextInt();
            int ketQua = 0;
            if(dauVao == 1){
                ketQua = a + b;
            }
            if(dauVao == 2){
                ketQua = a - b;
            }
            if(dauVao == 3){
                ketQua = a * b;
            }
            if(dauVao == 4) {
                ketQua = a / b;
            }
            System.out.println("Ket qua la: " + ketQua);
        }
        System.out.println("Good nye, have a nice day!");
    }
}
