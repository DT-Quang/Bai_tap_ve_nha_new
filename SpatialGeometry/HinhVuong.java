package SpatialGeometry;

public class HinhVuong {
    public static void main (String[] args) {
        int side =5 ;
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                if(i==1 || i==5 || j==1 || j==5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}