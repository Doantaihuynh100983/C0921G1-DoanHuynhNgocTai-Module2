package FuramaResort.validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateFacility {
    //    String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiThueToiDa, String kieuThue)
    Scanner scanner = new Scanner(System.in);

    public String tenDichVu() {
        String tenDichVu;
        while (true) {
            System.out.println("Nhập tên dịch vụ");
            tenDichVu = scanner.nextLine();
            Pattern p = Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])");
            if (p.matcher(tenDichVu).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Chữ Đầu Viết Hoa");
            }
        }
        return tenDichVu;
    }
}
