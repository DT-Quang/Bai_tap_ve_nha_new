//package Buoi6.animal;
//
//import java.util.Scanner;
//
//public class BTVN1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ManagerAnimal manager = new ManagerAnimal(10); // Khởi tạo danh sách với sức chứa ban đầu 10 động vật
//
//        while (true) {
//            System.out.println("\n===== MENU =====");
//            System.out.println("1. Nhập Lion");
//            System.out.println("2. Nhập Elephant");
//            System.out.println("3. Nhập Monkey");
//            System.out.println("4. Dừng nhập");
//            System.out.println("5. Hiển thị danh sách tất cả động vật");
//            System.out.println("6. Thêm động vật");
//            System.out.println("7. Tìm động vật theo tên");
//            System.out.println("8. Xóa động vật theo tên");
//            System.out.println("0. Thoát");
//            System.out.print("Lựa chọn của bạn: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Đọc dòng trống
//
//            switch (choice) {
//                case 1: // Nhập Lion
//                    System.out.print("Nhập tên Lion: ");
//                    String lionName = scanner.nextLine();
//                    System.out.print("Nhập tuổi Lion: ");
//                    int lionAge = scanner.nextInt();
//                    manager.addAnimal(new Lion(lionName, lionAge));
//                    break;
//
//                case 2: // Nhập Elephant
//                    System.out.print("Nhập tên Elephant: ");
//                    String elephantName = scanner.nextLine();
//                    System.out.print("Nhập tuổi Elephant: ");
//                    int elephantAge = scanner.nextInt();
//                    manager.addAnimal(new Elephant(elephantName, elephantAge));
//                    break;
//
//                case 3: // Nhập Monkey
//                    System.out.print("Nhập tên Monkey: ");
//                    String monkeyName = scanner.nextLine();
//                    System.out.print("Nhập tuổi Monkey: ");
//                    int monkeyAge = scanner.nextInt();
//                    manager.addAnimal(new Monkey(monkeyName, monkeyAge));
//                    break;
//
//                case 4: // Dừng nhập
//                    System.out.println("Dừng nhập!");
//                    break;
//
//                case 5: // Hiển thị danh sách
//                    manager.showAllAnimals();
//                    break;
//
//                case 6: // Thêm động vật mới
//                    System.out.print("Nhập tên động vật: ");
//                    String newName = scanner.nextLine();
//                    System.out.print("Nhập tuổi động vật: ");
//                    int newAge = scanner.nextInt();
//                    System.out.print("Nhập loại động vật (1: Lion, 2: Elephant, 3: Monkey): ");
//                    int type = scanner.nextInt();
//                    if (type == 1) {
//                        manager.addAnimal(new Lion(newName, newAge));
//                    } else if (type == 2) {
//                        manager.addAnimal(new Elephant(newName, newAge));
//                    } else if (type == 3) {
//                        manager.addAnimal(new Monkey(newName, newAge));
//                    } else {
//                        System.out.println("Loại động vật không hợp lệ!");
//                    }
//                    break;
//
//                case 7: // Tìm động vật theo tên
//                    System.out.print("Nhập tên động vật cần tìm: ");
//                    String searchName = scanner.nextLine();
//                    Animal foundAnimal = manager.findAnimal(searchName);
//                    if (foundAnimal != null) {
//                        foundAnimal.showInfo();
//                        foundAnimal.action();
//                    } else {
//                        System.out.println("Không tìm thấy động vật với tên: " + searchName);
//                    }
//                    break;
//
//                case 8: // Xóa động vật theo tên
//                    System.out.print("Nhập tên động vật cần xóa: ");
//                    String removeName = scanner.nextLine();
//                    manager.removeAnimal(removeName);
//                    break;
//
//                case 0: // Thoát
//                    System.out.println("Thoát chương trình.");
//                    scanner.close();
//                    return;
//
//                default:
//                    System.out.println("Lựa chọn không hợp lệ!");
//            }
//        }
//    }
//}
