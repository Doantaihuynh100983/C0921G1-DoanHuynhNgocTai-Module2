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
            System.out.println("Nhập mã dịch vụ room");
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
            System.out.println("Nhập mã dịch vụ house");
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


    public Double dienTichSuDung() {
        while (true) {

            try {
                System.out.println("Nhập diện tích sử dụng ");
                double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                if (dienTichSuDung > 30) {
                    return dienTichSuDung;
                }
                else {
                    throw  new Exception();
                }
            } catch (Exception e) {
                System.out.println("Bạn Phải Nhập Diện Tích Sử Dụng Lớn Hơn 30");
            }
        }

    }

    public Double chiPhiThue(){

        while (true) {

            try {
                System.out.println("Nhập Chi Phí Phải Trả Khi Thuê ");
                double chiPhiThue = Double.parseDouble(scanner.nextLine());
                if (chiPhiThue > 0) {
                    return chiPhiThue;
                }
                else {
                    throw  new Exception();
                }
            } catch (Exception e) {
                System.out.println("Bạn Phải Nhập Chi Phí Thuê Là Số Dương");
            }
        }


    }
    public int  soLuongNguoiThue() {

        while (true) {

            try {
                System.out.println("Nhập số lượng người thuê  ");
                int soLuongNguoiThue = Integer.parseInt(scanner.nextLine());
                if ( 0 < soLuongNguoiThue && soLuongNguoiThue<20) {
                    return soLuongNguoiThue;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Bạn Phải Nhập số lượng người thuê lớn 0 và nhỏ hơn 20 ");
            }
        }
    }

    public String kieuThue() {
        String kieuThue;
        while (true) {
            System.out.println("Nhập kiểu thuê");
            kieuThue = scanner.nextLine();
            Pattern p = Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])");
            if (p.matcher(kieuThue).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Chữ Đầu Viết Hoa");
            }
        }
        return kieuThue;
    }
    public String tieuChuanPhong() {
        String tieuChuanPhong;
        while (true) {
            System.out.println("Nhập tiêu chuẩn thuê");
            tieuChuanPhong = scanner.nextLine();
            Pattern p = Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])");
            if (p.matcher(tieuChuanPhong).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Chữ Đầu Viết Hoa");
            }
        }
        return tieuChuanPhong;
    }

    public Double dienTichHoBoi() {

        while (true) {
            try {
                System.out.println("Nhập diện tích hồ bơi ");
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

    public int soTang() {

        while (true) {
            try {
                System.out.println("Nhập số tầng ");
                int soTang = Integer.parseInt(scanner.nextLine());
                if (soTang > 0 && soTang < 20) {
                    return soTang;
                }
                else {
                    System.out.println("Bạn Phải Nhập số tầng lớn hơn 0 và nhỏ hơn 20 !!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public String dichVuDiKem() {
        String dichVuDiKem;
        while (true) {
            System.out.println("Nhập dịch vụ miễn phí đi kèm");
            dichVuDiKem = scanner.nextLine();
            Pattern p = Pattern.compile("(?=.*?[A-Z])(?=.*?[a-z])");
            if (p.matcher(dichVuDiKem).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Chuỗi ");
            }
        }
        return dichVuDiKem;
    }

}
