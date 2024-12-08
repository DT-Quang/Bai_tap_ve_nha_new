package SortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,9,21,3,7,10,15,6};

//        cách 1
//        for (int i = 0; i < arr.length; i++) {
//            int min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//            }
//            if (min != i) {
//                int temp = arr[min];
//                arr[min] = arr[i];
//                arr[i] = temp;
////            }
//            System.out.println(arr[i]+" ");
//        }

//        cách 2 có n-1 bước
        for(int i=0;i<arr.length-1;i++){
            // tìm phần tử nhỏ nhất thứ i+1
            int min = arr[i];
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            System.out.println("Phần tử thứ " + i + " là : "+ min);
            // đổi chỗ giữa i và index
            arr[index]=arr[i];
            arr[i]=min;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
