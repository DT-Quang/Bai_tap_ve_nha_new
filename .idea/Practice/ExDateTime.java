package Practice;

import java.util.Calendar;
import java.util.Scanner;

public class ExDateTime {
    public static void main(String[] args) {
/*      viết chương trình nhập ngày tháng năm sinh
        cho biết số tuổi và in ra màn hình
        */
        int day , month, year;
//        nhập dữ liệu
        Scanner input = new Scanner(System.in);
        System.out.println(" Mời nhập vào ngày sinh");
        day = input.nextInt();
        System.out.println(" Mời nhập vào tháng sinh");
        month = input.nextInt();
        System.out.println(" Mời nhập vào năm sinh");
        year = input.nextInt();
//        khởi tạo
        Calendar birthday = Calendar.getInstance();
//        set ngày tháng năm sinh do người dùng nhập
        birthday.set(year, month-1 , day);
// xuất ngày tháng năm sinh
       int namSinh=birthday.get(Calendar.YEAR);
       int thangSinh=birthday.get(Calendar.MONTH)+1;
       int ngaySinh =birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println(" Ngày tháng năm sinh : "
                + ngaySinh + "-" + thangSinh + "-" + namSinh);
//        tính tuổi
        Calendar now = Calendar.getInstance();
        int namHt = now.get(Calendar.YEAR);
        int tuoi = namHt-namSinh;
        System.out.println(" Bạn bây giờ " + tuoi + " tuổi ");
    }
}
