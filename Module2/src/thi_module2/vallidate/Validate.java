package thi_module2.vallidate;

import thi.service.QuanLyNganHangSerrvce;
import thi.vallidate.NotFoundBankAccountException;
import thi_module2.service.DienThoaiServiceImpl;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    public static final String STRINGREGEX= "(?=.*?[A-Z])(?=.*?[a-z])";
    private Validate() {
    }
    static Scanner scanner = new Scanner(System.in);
    static DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();
    public  static  String idCanXoa() throws NotFoundProductException {
        String idCanXoa;
        while (true) {
            System.out.println("Nhập mã tài khoản cần xóa");
            idCanXoa = scanner.nextLine();
            if (dienThoaiService.checkDeleteID(idCanXoa)) {
                break;
            } else {
                throw new NotFoundProductException();
            }
        }
        return idCanXoa;
    }

    public static double giaBan(){
        double giaBan;
        while (true){
            try {
                System.out.println("Mời nhập giá bán");
                giaBan = Integer.parseInt(scanner.nextLine());
                if (giaBan > 0) {
                    break;
                }else {
                    System.err.println("Bạn Phải Nhập Số Dương");
                }
            } catch (NumberFormatException e) {
                System.err.println("Không Được Nhập Chữ");
            }
        }
        return giaBan;
    }

        public static int thoiGianBaoHang(){
            int thoiGianBaoHang;
            while (true){
                try {
                    System.out.println("Mời Thời Gian Bản Hành");
                    thoiGianBaoHang = Integer.parseInt(scanner.nextLine());
                    if (thoiGianBaoHang > 0 && thoiGianBaoHang < 730) {
                        break;
                    }else {
                        System.err.println("Bạn Phải Nhập Số Lớn Hơn 0 Ngày Và Nhỏ Hơn 730 Ngày !!!");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Không Được Nhập Chữ");
                }
            }
            return thoiGianBaoHang;
        }


        public static String quocGiaBaoHanh(){
            String quocGiaBaoHanh;
            while (true){
                try {
                    System.out.println("Mời nhập Quốc Gia Xách Tay");
                    quocGiaBaoHanh = scanner.nextLine();
                    if (!(quocGiaBaoHanh.equals("") || quocGiaBaoHanh.equals("Viet Nam") ||quocGiaBaoHanh.equals("VietNam"))) {
                        break;
                    }else {
                        System.err.println("Bạn Không ĐƯỢC Để Trống hoặc  Nhập Việt Nam");
                    }
                } catch (Exception e) {
                    System.err.println("Không Hợp Lệ");
                }
            }
            return quocGiaBaoHanh;
        }


        public static String trangThai(){
                String trangThai;
            while (true){
                try {
                    System.out.println("Mời nhập trạng thái");
                    trangThai = scanner.nextLine();
                    if (trangThai.equals("Dasuachua") || trangThai.equals("Chuasuachua")) {
                        break;
                    }else {
                        System.err.println("Trạng Thái Chỉ Có ĐÃ SỮA CHỮA HOẶC CHƯA SỮA CHỮA !!!");
                    }
                } catch (Exception e) {
                    System.err.println("Không Hợp Lệ");
                }
            }
            return trangThai;
        }



    public static String tenDienThoai() {
        String tenDienThoai;
        while (true) {
            System.out.println("Nhập tên điện thoại");
            tenDienThoai = scanner.nextLine();
            Pattern p = Pattern.compile(STRINGREGEX);
            if (p.matcher(tenDienThoai).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Chữ Đầu Viết Hoa");
            }
        }
        return tenDienThoai;
    }

    public static String nhaSanXuat() {
        String nhaSanXuat;
        while (true) {
            System.out.println("Nhập nhà sản xuẩt");
            nhaSanXuat = scanner.nextLine();
            Pattern p = Pattern.compile(STRINGREGEX);
            if (p.matcher(nhaSanXuat).find()) {
                break;
            } else {
                System.err.println("Bạn Phải Nhập Chữ Đầu Viết Hoa");
            }
        }
        return nhaSanXuat;
    }

    public static int soLuong(){
        int soLuong;
        while (true){
            try {
                System.out.println("Mời Nhập Số Lượng");
                soLuong = Integer.parseInt(scanner.nextLine());
                if (soLuong > 0 && soLuong < 100) {
                    break;
                }else {
                    System.err.println("Bạn Phải Nhập Số Lớn Hơn 0 Ngày Và Nhỏ Hơn 100 Cái !!!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Không Được Nhập Chữ");
            }
        }
        return soLuong;
    }


    public static String soDuTrongThang(){
        String soDuTrongThang;
        while (true){
            try {
                System.out.println("Mời nhập trạng thái");
                soDuTrongThang = scanner.nextLine();
                if (soDuTrongThang.equals("")) {
                    break;
                }else {
                    System.err.println("Không được để trống");
                }
            } catch (Exception e) {
                System.err.println("Không Hợp Lệ");
            }
        }
        return soDuTrongThang;
    }


}
