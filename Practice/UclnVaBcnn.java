package Practice;

import java.util.Scanner;

public class UclnVaBcnn {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(" Nhập số a ");
        int a = sc.nextInt();
        System.out.print(" Nhập số b ");
        int b = sc.nextInt();
        UclnVaBcnn uclnVaBcnn = new UclnVaBcnn();
        uclnVaBcnn.getUCLN(a, b);
        uclnVaBcnn.getBCNN(b, a);
    }
    void getUCLN(int a, int b){
        int max=0;
        for(int i=1; i<=a;i++){
            if(a%i==0 && b%i==0){
                max=i;
            }
        }
        System.out.println(" Ước chung lớn nhất của a và b là : " + max);
    }
    void getBCNN(int a, int b){
        int min=0;
        for(int i=1; ;i++){
            if(i%a==0 && i%b==0){
                min=i;
                break;
            }
        }
        System.out.println(" Bội chung nhỏ nhất của a và b là : " + min);
    }
}
