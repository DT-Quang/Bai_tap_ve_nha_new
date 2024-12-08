package MaTran;

public class SapXep {
    public static void main(String[] args) {
        int[][] arr={
                {9,1,3},
                {4,7,2},
                {5,6,8}
        };
        System.out.println("Ma trận ban đầu ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int rows=arr.length;
        int cols=arr[0].length;
        String mangTam;
        int[] tempArr=new int[rows*cols];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                tempArr[index++]=arr[i][j];
            }
        }
        for(int i=0;i< tempArr.length;i++){
            for(int j=i+1;j< tempArr.length;j++){
                if(tempArr[i]>tempArr[j]){
                    int temp=tempArr[i];
                    tempArr[i]=tempArr[j];
                    tempArr[j]=temp;
                }
            }
        }
        int index1=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=tempArr[index1++];
            }
        }
        System.out.println("Ma trận sau khi sắp xếp lại là ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
