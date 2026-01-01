package session13_Kha1;
import java.util.LinkedList;
import java.util.Scanner;
public class UserManagement {
    static void main() {
        LinkedList<Person> users = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng theo email");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập email: ");
                    String email = sc.nextLine();
                    System.out.print("Nhập phone: ");
                    String phone = sc.nextLine();

                    users.add(new Person(name, email, phone));
                    System.out.println("Đã thêm người dùng");
                    break;

                case 2:
                    System.out.print("Nhập email cần xóa: ");
                    String emailDelete = sc.nextLine();

                    boolean found = false;
                    for (Person p : users) {
                        if (p.getEmail().equalsIgnoreCase(emailDelete)) {
                            users.remove(p);
                            found = true;
                            System.err.println("Đã xóa người dùng");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy email");
                    }
                    break;

                case 3:
                    System.out.println("\nDanh sách người dùng:");
                    if (users.isEmpty()) {
                        System.out.println("Danh sách trống");
                    } else {
                        for (Person p : users) {
                            p.display();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }
}
