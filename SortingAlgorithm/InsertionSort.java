package SortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,8,3,4,9,1,5,10,7,6,21,11};
//         cách 1
//        for(int i=1;i<arr.length;i++){
//            int j=i-1;
//            int temp=arr[i];
//            while(  j>=0 && temp<arr[j]){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=temp;
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }


//        cách 2
        for(int i=1;i<arr.length;i++){
            for(int j=i ; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                } else {
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
