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

    public String maVilla() {
        String maVilla;
        while (true) {
            System.out.println("Nhập mã dịch vụ Villa");
            maVilla = scanner.nextLine();
            Pattern p = Pattern.compile("^SVVL-\\d{4}$");
            if (p.matcher(maVilla).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Đúng SVXX-YYYY - YYYY là các số từ 0-9,  XX là VL");
            }
        }
        return maVilla;
    }


    public String maRoom() {
        String maRoom;
        while (true) {
            System.out.println("Nhập mã dịch vụ Villa");
            maRoom = scanner.nextLine();
            Pattern p = Pattern.compile("^SVRO-\\d{4}$");
            if (p.matcher(maRoom).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Đúng SVXX-YYYY - YYYY là các số từ 0-9,  XX là RO");
            }
        }
        return maRoom;
    }


    public String maHouse() {
        String maHouse;
        while (true) {
            System.out.println("Nhập mã dịch vụ Villa");
            maHouse = scanner.nextLine();
            Pattern p = Pattern.compile("^SVHO-\\d{4}$");
            if (p.matcher(maHouse).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Đúng SVXX-YYYY - YYYY là các số từ 0-9,  XX là HO");
            }
        }
        return maHouse;
    }


    public Double dienTichHoBoi() {

        while (true) {

            try {
                System.out.println("Nhập diện tích hồ bơi");
                double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
                if (dienTichHoBoi > 30) {
                    return dienTichHoBoi;
                }
                else {
                    throw  new Exception();
                }
            } catch (Exception e) {
                System.out.println("Bạn Phải Nhập Diện Tích Hồ Bơi Lớn Hơn 30");
            }
        }

    }

}
