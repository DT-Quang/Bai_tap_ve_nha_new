package Buoi9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        School school = new School();
        while (true) {
            System.out.println("\nHệ thống quan lý sinh viên :");
            System.out.println("1 : Thêm sinh viên ");
            System.out.println("2 : Xóa sinh viên ");
            System.out.println("3 : Hiển thị danh sách ");
            System.out.println("4 : Tìm kiếm sinh viên theo tên ");
            System.out.println("5 : Sắp xếp theo điểm thi ");
            System.out.println("6 : Kiểm tra sinh viên có tồn tại không ");
            System.out.println("7 : Thoát ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        school.addStudent(school.getId());
                        break;
                    case 2:
                        school.delStudent(school.getId());
                        break;
                    case 3:
                        school.displayStudents();
                        break;
                    case 4:
                        school.searchStudentByName(school.getName());
                        break;
                    case 5:
                        school.sortStudentsByScore();
                        break;
                    case 6:
                        school.studentExists(school.getId());
                        break;
                    case 7:
                        System.out.println(" Thoát chương trình ! ");
                        return;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
