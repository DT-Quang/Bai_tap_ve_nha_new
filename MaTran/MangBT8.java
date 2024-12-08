package MaTran;

import java.util.Scanner;

public class MangBT8 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số hàng và cột của mảng : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Ma trận vừa lập là : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        MangBT8 mangBT8 = new MangBT8();
//        mangBT8.getMax(arr);
//        mangBT8.getSXCot(arr);
//        mangBT8.getSNT(arr);
        mangBT8.getDuyet(arr);

    }

    public void getMax(int[][] arr) {
        int max = arr[0][0];
        int n = 0, m = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println("Số lớn nhất tại trong ma trận tại hàng " + n + " và cột " + m + " là : " + max);

    }

    public void getSNT(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int dem = 0;
                for (int k = 1; k < 100; k++) {
                    if (arr[i][j] % k == 0) {
                        dem++;
                    }
                }
                if (dem != 2) {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println(" Các số nguyên tố trong ma trận là : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//    void getSXCot(int[][] arr) {
//       int n = arr.length;
//       int m = arr.length;
//       for (int i = 0; i < m; i++) {
//           int[] brr= new int[n];
//           for (int j = 0; j < n; j++) {
//               brr[j] = arr[j][i];
//           }
//           Arrays.sort(brr);
//           for (int j = 0; j < n; j++) {
//               arr[j][i] = brr[j];
//           }
//       }
//        System.out.println(" Ma trận sau khi được sắp xếp là : ");
//
//           for (int j = 0; j < m; j++) {
//               for (int i = 0; i < n; i++) {
//               System.out.print(arr[j][i]+" ");
//           }
//               System.out.println();
//       }
//    }

    void getSXCot(int[][] arr) {
        int n = arr.length; // so hang
        System.out.println("n :" + n);
        int m = arr[0].length; // so cot
        System.out.println("m : " + m);
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[j][i] > arr[k][i]) {
                        c = arr[j][i];
                        arr[j][i] = arr[k][i];
                        arr[k][i] = c;
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    void getDuyet(int[][] arr) {
        int cot = 0;
        int max = 0;
        int demmax = 0;
        int tempArr[] = new int[arr[0].length];


        for (int j = 0; j < arr[0].length; j++) {
            demmax = 0;
            for (int i = 0; i < arr.length; i++) {
                int dem = 0;
                for (int k = 1; k < 100; k++) {
                    if (arr[i][j] % k == 0) {
                        dem++;
                    }
                }
                if (dem == 2) {
                    demmax++;
//                    System.out.println("cot j :" + j + " va demax :" + demmax);

                }
            }
            tempArr[j] = demmax;
            if (max < demmax) {
                max = demmax;
                cot = j;
            }
        }

        for(int i = 0 ; i < tempArr.length;i++)
            if(tempArr[i] == max)
                System.out.println(" Cột " + i + " có nhiều số nguyên tố nhất và có " + max + " số ");

//        switch (max) {
//            case 0: {
//                System.out.println(" Không cột nào có số nguyên tố ");
//                break;
//            }
//            default: {
//                System.out.println(" Cột " + cot + " có nhiều số nguyên tố nhất và có " + max + " số ");
//            }
//        }
    }
}
