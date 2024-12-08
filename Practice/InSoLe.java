package Practice;

import java.util.Scanner;

public class InSoLe {
    private int n ;

    public static void main(String[] args) {
        InSoLe inSoLe = new InSoLe ();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mang.Nhap n: ");
        inSoLe.n = scanner.nextInt();;
        System.out.print("cac so le tu 0 den n la ");
        int soDauTien = 1;
        for(int i = 0; i <= inSoLe.n; i++ ){
            if(i%2!=0 ){
//                // cach 1
//                System.out.print(i);
//                if( i != inSoLe.n && i != inSoLe.n -1 )
//                    System.out.print(", ");

                // cach 2
                if(soDauTien == 1){
                    soDauTien = 0;
                }
                else {
                    System.out.print(",");
                }
                System.out.print(i);
            }

        }


    }
}
