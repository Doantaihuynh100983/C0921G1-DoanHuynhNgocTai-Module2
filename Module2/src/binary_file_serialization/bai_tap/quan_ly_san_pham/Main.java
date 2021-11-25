package binary_file_serialization.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductSevrvic productSevrvic = new ProductSevrvic();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 4) {

            System.out.println("1. Thêm mới Product");
            System.out.println("2. Hiện thị Product");
            System.out.println("3. Tìm Kiếm");
            System.out.println("4. Thoát");

            System.out.println("Nhập từ 1 đến 6 để chọn chức năng");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    productSevrvic.add();
                    break;
                case 2:
                    productSevrvic.disPlay();
                    break;
                case 3:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("nhập mã sản phẩm");
                        String s = scanner.nextLine();
                    productSevrvic.search(s);
                    break;

                case 4:
                    System.exit(0);
                    break;

            }
        }
    }
}
