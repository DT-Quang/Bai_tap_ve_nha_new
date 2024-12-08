package LessonContent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Calendar cal  = Calendar.getInstance();
        System.out.println(cal);
//        lấy ngày tháng năm
        int nam =cal.get(Calendar.YEAR);
        int thang =cal.get(Calendar.MONTH)+1;
        int ngay =cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang);
        System.out.println(ngay);

        //         xuất theo định dạng
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a ");
//        tạo 1 đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        java.lang.String formatDate = dinhDang.format(d);
        System.out.println(formatDate);

//        set ngày tháng năm theo ý muốn
        cal.set(Calendar.YEAR,1999);
        cal.set(Calendar.MONTH,07);
        // tháng trong phương thức chỉ chạy từ 0->11 nên cần trừ đi 1 số khi nhập khi nhập tháng 12
        cal.set(Calendar.DAY_OF_MONTH,20);
//        kiểm tra ngày tháng sau thiết lập
        int namSinh =cal.get(Calendar.YEAR);
        int thangSinh =cal.get(Calendar.MONTH);
//        nếu nhập tháng 12 giảm đi 1 thì cần cộng thêm 1 ở month
        int ngaySinh =cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(" Ngày tháng năm sinh : "
        + ngaySinh + "-" + thangSinh + "-" + namSinh);


    }
}
