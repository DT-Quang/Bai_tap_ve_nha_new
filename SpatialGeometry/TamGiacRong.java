package SpatialGeometry;

public class TamGiacRong {
    public static void main(String[] args ){
        int side = 6;
        for( int i=1; i<=side; i++){
            for(int j=1; j<=i; j++){
//                if( i==3 && j==2 || i==4 && j==2 || i==4 && j==3){
                if(i==1 || i==side || j==1 || j==i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
