package LessonContent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        // khai báo list
        ArrayList<Integer> list = new ArrayList<>();
        // khai báo vs số lượng ban đầu
        ArrayList<Integer> list2 = new ArrayList<>(10);
        // khai báo vs giá trị phần tử ban đầu
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1,2,3,4,5));

        // xuất mảng
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);


        // add thêm phần tử
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        System.out.println(list4);
        list4.add(1,0); // add vào vị trí index
        System.out.println(list4);



        // trả về số phần tử của list
        System.out.println(list4.size());



        // trả về giá trị của list tại vị trí index
        System.out.println(list4.get(0));



        // remote xóa pt tại index
        list4.remove(0);
        System.out.println(list4);

        ArrayList<Integer> list5 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(list5);
        list5.remove(Integer.valueOf(3)); // xóa phần tử đc chỉ điịnh
        System.out.println(list5);


        // set(index.element) thay đổi thông tin tại vị trí index
        ArrayList<Integer> list6 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(list6);
        list6.set(4,10);
        System.out.println(list6);


        // contains() kiểm tra collection có chứa phần tử nào đó ko
        ArrayList<Integer> list7 = new ArrayList<>(List.of(1,2,3,4,5));
        boolean kiemTra = list7.contains(6);
        System.out.println(kiemTra);


        // Collections.sort(list) sắp xếp tăng dần
        ArrayList<Integer> list8 = new ArrayList<>(List.of(1,7,5,4,2));
        Collections.sort(list8);
        System.out.println(list8);


        // indexOf() tim vị tri dau tien của element trong list
        // nếu ko có trả về -1
        System.out.println(list8.indexOf(7));


        // duyet list
        ArrayList<Integer> list10 = new ArrayList<>(List.of(1,7,5,4,2));
        // dùng for
        for(int valua : list10) {
            System.out.print(valua + " ");
        }
        System.out.println();
        // cách 2 khi cần sử dụng đến vị trí index
        for(int i=0; i<list10.size();i++){
            int valua=list10.get(i);
            System.out.print(valua+" ");
        }
        System.out.println();





    }
}
