package LessonContent;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        try {
            int c=a/b;
            System.out.println(c);
        }
//        bắt lỗi toán học
        catch(ArithmeticException ex) {
            System.out.println(" Có lỗi toán học ");
            ex.printStackTrace();
        }
//       bắt tổng tất cả các lỗi
        catch (Exception ex) {
            System.out.println(" Có lỗi ");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Có lỗi hay không vẫn phải chạy ");
            int d=a+b;
            System.out.println(d);
        }
    }
}
