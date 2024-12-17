package Practice;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 10, 7, 8, 2, 12, 6, 4, 20};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp giảm dần là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
