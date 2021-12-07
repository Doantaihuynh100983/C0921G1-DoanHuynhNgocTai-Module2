package thi_module2.controllers;

import thi_module2.service.DienThoaiServiceImpl;
import thi_module2.exception.NotFoundProductException;
import thi_module2.vallidate.Validate;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 5) {
            try {


                System.out.println("1. Thêm mới điện thoại");
                System.out.println("2. Xóa điện thoại");
                System.out.println("3. Xem danh sách các điện thoại");
                System.out.println("4. Tìm Kiếm");
                System.out.println("5. Thoát");

                System.out.println("Nhập từ 1 đến 5 để chọn chức năng");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        int choice1 = 0;
                        while (choice1 != 3) {
                            try {


                                System.out.println("1 Thêm mới điện thoại chính hãng ");
                                System.out.println("2 Thêm mới điện thoại xách tay ");
                                System.out.println("3. Quay lại menu chính");
                                System.out.println("Nhập từ 1 đến 3 để thứ");

                                choice1 = Integer.parseInt(sc.nextLine());
                                switch (choice1) {
                                    case 1:
                                        dienThoaiService.addChinhHang();
                                        break;
                                    case 2:
                                        dienThoaiService.addXachTay();
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.err.println("Không có chữ năng này !!");
                                        break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                System.err.println("Không được nhập chữ nha !!!");
                            }
                        }
                        break;
                    case 2:
                        Scanner scanner = new Scanner(System.in);
                        while (true) {
                            try {
                                String idDienThoai = Validate.idCanXoa();
                                System.out.println("1 Yes \n 2 No");
                                int chon = Integer.parseInt(scanner.nextLine());
                                if (dienThoaiService.checkDeleteID(idDienThoai)) {
                                    if (chon == 1) {
                                        dienThoaiService.delete(idDienThoai);
                                        System.err.println("Đã Xóa Thành Công");
                                        break;
                                    } else if (chon == 2) {
                                        break;
                                    }

                                }

                            } catch (NotFoundProductException e) {
                                System.err.println("Không tồn tại !!!!");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Danh Sách Khách Hàng");
                        dienThoaiService.disPlay();
                        break;
                    case 4:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Mời bạn nhập tên hoặc mã điện thoại  cần tìm kiếm !!!");
                        String timKiem = scanner1.nextLine();
                        dienThoaiService.search(timKiem);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Không có chức năng này  !!!");
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.err.println("Không được nhập chữ");
            }
        }
    }
}
