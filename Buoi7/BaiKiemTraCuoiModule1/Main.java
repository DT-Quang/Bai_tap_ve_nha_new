package Buoi7.BaiKiemTraCuoiModule1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager students = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nQuản lý danh sách sinh viên");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi sinh viên: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Nhập mã sinh viên: ");
                    String maSV = scanner.nextLine();

                    Student student = new Student(name, age, maSV);
                    students.addStudent(student);
                    break;
                case 2:
                    System.out.println("Nhập mã sinh viên cần sửa: ");
                    String editId = scanner.nextLine();
                    students.editStudent(editId);
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    String deleteId = scanner.nextLine();
                    students.deleteStudent(deleteId);
                    break;
                case 4:
                    System.out.println("Nhập tên sinh viên cần tìm: ");
                    String searchName = scanner.nextLine();
                    students.searchStudentByName(searchName);
                    break;
                case 5:
                    students.displayStudents();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
