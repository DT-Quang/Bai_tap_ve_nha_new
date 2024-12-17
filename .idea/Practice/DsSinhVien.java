package Practice;

import java.util.Scanner;

public class DsSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcd";
        char[] arr = s.toCharArray();
        double a=8.5,b=9.2,c=8.9,d=9.8;
        for(int i=0;i<arr.length;i++){
            char temp=arr[i];
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]<arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Sinh viên " + arr[i] + " xếp hạng " + (i+1));
        }
    }
}
