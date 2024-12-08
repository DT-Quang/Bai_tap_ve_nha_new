package Stringg;

public class STRING1 {
    public static void main(String[] args) {
        java.lang.String s = " Hỡi cô má đỏ hây hây , " +
                "\n Cho anh mượn đất anh trồng củ khoai . ";
        System.out.println(s);

        //khai báo đối tượng st
        java.lang.StringBuilder chuoi = new java.lang.StringBuilder();

        //append thêm vào cuối chuỗi
        chuoi.append("Xin chao , ");
        chuoi.append(" tôi là Quang ");
        System.out.println(chuoi);

        //insert( vị trí , chuỗi cần chèn )
        chuoi.insert(0,"Hi guy , ");
        System.out.println(chuoi);

        //delete(start, end)
        chuoi.delete(0,9);
        System.out.println(chuoi);

        System.out.println(chuoi.length());

        // indexOf kiểm tra vị trí xuất hiện đầu tiên của kí tự hoặc chuỗi
        java.lang.String s7 = " tôi đi tìm  tôi ";
        System.out.println(s7.indexOf("tôi"));
        // trả về vị trí cuối cùng xuất hiện
        System.out.println(s7.lastIndexOf("tôi"));

        //Contains kiểm tra chuỗi con
        java.lang.String s9="mp3";
        java.lang.String s10="tôi thích nghe mp4";

        boolean check =s10.contains(s9);
        if(check) //== if(check==true)
            System.out.println("Có mp3 trong chuỗi ");
        else
            System.out.println("Ko có mp3 trong chuỗi");

        //Substring trích , lọc chuỗi con từ chuỗi ban đầu

        java.lang.String s11 ="abcdefghik";
        System.out.println(s11);
        java.lang.String s12 =s11.substring(5); // trich từ index 5 đến end-1
        System.out.println(s12);
        java.lang.String s13 =s11.substring(0,5); //tricsch từ index 0 den index 5
        System.out.println(s13);

        // replace thay thế chuỗi old thành chuỗi new
        java.lang.String s14 = " học học nữa học mãi ";
        System.out.println(s14);
        java.lang.String s15 =s14.replace("học","ăn"); // thay thế toàn bộ
        System.out.println(s15);
        java.lang.String s16 =s14.replaceFirst("học","ăn"); // thay thế từ đầu tiên
        System.out.println(s16);

        //trim xóa toàn bộ space ở đầu và cuối chuỗi\
        java.lang.String s17 = "      Tôi làm được !       ";
        System.out.println(s17);
        java.lang.String s18=s17.trim();
        System.out.println(s18);
        // xóa toàn bộ khoảng trắng cuối dùng \s+$ (đây là mẹo)
        java.lang.String s20=s18.replaceAll("\\s+$","");
        System.out.println(s20);
        // xóa khoảng trắng ởcuooisi chuỗi dùng vòng lặp while
        java.lang.String s21 = "       Sao bài ni dài thế          ";
        while (s21.endsWith(" ")){
            s21=s21.substring(0,s21.length()-1);
        }
        System.out.println(s21);
        // xóa khoảng trắng ở đầu dùng ^\\s+
        java.lang.String s22=s21.replaceFirst("^\\s+","");
        System.out.println(s22);
        // xóa khoảng trắng ở đầu bằng vòng lặp
        java.lang.String s23 = "       Sao bài ni dài thế          ";

        while(s21.startsWith(" ")){
            s23=s23.substring(1);
        }
        System.out.println(s23);
    }
}
