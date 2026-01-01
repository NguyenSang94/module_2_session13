package session13_Gioi1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        InvoiceManager manager = new InvoiceManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ HÓA ĐƠN =====");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Sửa hóa đơn");
            System.out.println("3. Xóa hóa đơn");
            System.out.println("4. Hiển thị danh sách hóa đơn");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã hóa đơn: ");
                    String code = scanner.nextLine();
                    System.out.print("Nhập số tiền: ");
                    double amount = scanner.nextDouble();
                    manager.add(new Invoice(code, amount));
                    break;

                case 2:
                    System.out.print("Nhập vị trí cần sửa: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập mã hóa đơn mới: ");
                    String newCode = scanner.nextLine();
                    System.out.print("Nhập số tiền mới: ");
                    double newAmount = scanner.nextDouble();
                    manager.update(updateIndex, new Invoice(newCode, newAmount));
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

