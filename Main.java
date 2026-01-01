package session13_Kha2;

import java.util.Scanner;

public class Main {
     static void main(String[] args) {
        AttendanceManager manager = new AttendanceManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ ĐIỂM DANH =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    manager.add(new Student(name));
                    break;

                case 2:
                    System.out.print("Nhập vị trí cần sửa: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    manager.update(updateIndex, new Student(newName));
                    break;

                case 3:
                    System.out.print("Nhập vị trí cần xóa: ");
                    int deleteIndex = scanner.nextInt();
                    manager.delete(deleteIndex);
                    break;

                case 4:
                    manager.display();
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }
}

