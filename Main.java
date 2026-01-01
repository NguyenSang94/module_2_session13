package session13_Gioi2;

import java.util.Scanner;

public class Main {
     static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ ĐƠN HÀNG =====");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách đơn hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã đơn hàng: ");
                    String code = scanner.nextLine();
                    System.out.print("Nhập tên khách hàng: ");
                    String customer = scanner.nextLine();
                    manager.add(new Order(code, customer));
                    break;

                case 2:
                    System.out.print("Nhập vị trí cần sửa: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập mã đơn hàng mới: ");
                    String newCode = scanner.nextLine();
                    System.out.print("Nhập tên khách hàng mới: ");
                    String newCustomer = scanner.nextLine();
                    manager.update(updateIndex, new Order(newCode, newCustomer));
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

