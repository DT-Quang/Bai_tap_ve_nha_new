package Buoi7.BaiKiemTraCuoiModule1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {


    private ArrayList<Student> students = new ArrayList<>();




    public void addStudent(Student student) {
        for(Student stud : students) {
            if(stud.getMaSV().equals(student.getMaSV())) {
                System.out.println(" Mã sinh viên đã tồn tại , không cần thêm ");
                return;
            }
        }
        students.add(student);
        System.out.println("Thêm sinh viên thành công");

    }

    public void editStudent(String maSv) {
        for(Student stud : students) {
            if(stud.getMaSV().equals(maSv)) {
                Scanner sc = new Scanner(System.in);

                System.out.println(" Nhập tên sinh viên cần sửa ");
                stud.setName(sc.nextLine());

                System.out.println(" Nhập tuổi sinh viên cần sửa ");
                stud.setAge(sc.nextInt());
                sc.nextLine();

                System.out.println(" Nhập mã sinh viên cần sửa ");
                stud.setMaSV(sc.nextLine());

                System.out.println(" Chỉnh sửa thông tin thành công ");
                return;


            }
        }

        System.out.println(" Không tìm thấy sinh viên mã " + maSv);
    }

    public void deleteStudent(String maSV) {
        for (Student student : students) {
            if (student.getMaSV().equals(maSV)) {
                students.remove(student);
                System.out.println("Xóa sinh viên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: " + maSV);
    }

    public void searchStudentByName(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với tên: " + name);
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }


}




