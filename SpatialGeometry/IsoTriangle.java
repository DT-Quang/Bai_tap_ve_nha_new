package SpatialGeometry;

public class IsoTriangle {
    public static void main(String[] args){
        int side=5;
        for(int i=1; i<=side; i++){
            for(int j=1; j<=i; j++){

                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
