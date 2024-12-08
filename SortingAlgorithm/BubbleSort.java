package SortingAlgorithm;

import java.util.Scanner;

public class BubbleSort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Dãy số sau khi được sắp xếp lại là :");
        int[] arr = {2, 4, 1, 6, 12, 8, 9, 10, 5, 7};
        for (int i = 0; i < arr.length ; i++) {
            int temp = arr[i];
            for (int j = 0 ; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
