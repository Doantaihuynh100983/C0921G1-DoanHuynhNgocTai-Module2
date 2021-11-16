package java_collection_framework.bai_tap.arraylist_linkkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (choice != 8) {

            System.out.println("1. Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần");
            System.out.println("7.Sắp xếp sản phẩm tăng dần");
            System.out.println("8. Thoát");

            System.out.println("Nhập từ 1 đến 8 để chọn chức năng");
            choice = sc.nextInt();
            switch ( choice ) {
                case  1:
                    productManager.add();
                    break;
                case  2:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập mã sản phẩm cần sữa");
                    String maSanPham1 = scanner.nextLine();
                    productManager.edit(maSanPham1);
                    break;
                case  3:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhập mã sản phẩm cần xóa");
                    String maSanPham2 = scanner1.nextLine();
                    productManager.delete(maSanPham2);
                    break;
                case  4:
                    productManager.disPlay();
                    break;
                case  5:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Nhập mã sản phẩm cần tìm kiếm");
                    String tenSanPham1 = scanner2.nextLine();
                    productManager.search(tenSanPham1);
                    break;
                case  6:
                    System.out.println("Sắp Xếp Tăng Dần");
                    productManager.sort_up_ascending();
                    break;
                case  7:
                    System.out.println("Sắp Xếp Giảm Dần");
                    productManager.sort_descending();
                    break;

                default:
                    System.err.println("Không có trong chức năng");
            }
    }
}
}
