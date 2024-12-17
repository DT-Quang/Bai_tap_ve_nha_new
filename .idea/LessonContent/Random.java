package LessonContent;

public class Random {
    public static void main(String[] args) {
//        khởi tạo đối tượng ngẫu nhiên
        java.util.Random rand = new java.util.Random();
//        1. lấy ngẫu nhiên một số nguyên
        int soNguyen = rand.nextInt(-50,50); // chạy từ -50 đến <50
        System.out.println(soNguyen);

//        chạy ngẫu nhiên số thực
        double soThuc = rand.nextDouble(-50,50);
        System.out.println(soThuc);
    }
}
