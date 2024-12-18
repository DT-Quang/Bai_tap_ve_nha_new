package Buoi9;

import java.util.*;

public class School extends Student {
    Scanner sc = new Scanner(System.in);

    private List<Student> students = new ArrayList<>();
    private Set<String> studentIds = new HashSet();

    public void addStudent(String id ) {

        Student student = new Student();
        student.nhapThongTin();
        students.add(student);
        studentIds.add(id);
    }

    public void delStudent(String id) {
        System.out.println(" Nhập mã sinh viên muốn xóa ");
        id = sc.nextLine();
        boolean delete = false;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                studentIds.remove(id);
                delete = true;
                break;
            }
        }
        if (!delete) {
            throw new IllegalArgumentException(" Sinh viên với mã " + id + " không tồn tại ");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống ");
        } else {
            for (Student student : students) {
                student.hienThiThongTin();
            }
        }
    }

    public void searchStudentByName(String name) {
        System.out.println(" Nhập tên sinh viên muốn xem ");
        name = sc.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
            student.hienThiThongTin();
        }
        if (!found) {
            throw new IllegalArgumentException(" Không tồn tại sinh viên " + name);
        }
    }

    public void sortStudentsByScore() {

        if (students.isEmpty()) {
            throw new IllegalArgumentException("Danh sách trống");
        }
        Collections.sort(students, Comparator.comparingDouble(Student::getScore));
    }

    public void studentExists(String id) {
        System.out.print(" Nhập mã sinh viên muốn kiểm tra ");
        id = sc.nextLine();
        if(!( studentIds.contains(id))){
            System.out.println(" Không tồn tại sinh viên với mã " + id);
        } else
            System.out.println(" Tồn tại sinh viên với mã " + id);
    }

}
