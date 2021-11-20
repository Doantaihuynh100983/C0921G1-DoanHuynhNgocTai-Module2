package baitap_anhchanhgiao.validate;

import baitap_anhchanhgiao.models.Oto;

import java.util.Scanner;

public class ValiDate {

    Scanner scanner = new Scanner(System.in);

    public String bienKiemSoat() {
        String bangKiemSoat;
        while (true) {
            try {
                System.out.println("nhập biển số");
                bangKiemSoat = scanner.nextLine();
                if (!bangKiemSoat.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Lỗi nhập rồi ");
            }
        }
        return bangKiemSoat;
    }










    public String tenHangSanXuat() {
        String tenHangSanXuat;
        while (true) {
            try {
                System.out.println("nhập tên hãng sản xuất");
                tenHangSanXuat = scanner.nextLine();
                if (!tenHangSanXuat.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Lỗi nhập rồi");
            }
        }
        return tenHangSanXuat;


    }

    public int namSanXuat() {
        int namSanXuat;
        while (true) {
            try {
                System.out.println("nhập năm sản xuất");
                namSanXuat = Integer.parseInt(scanner.nextLine());
                if (namSanXuat > 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return namSanXuat;


    }

    public String chuSoHuu() {
        String chuSoHuu;
        while (true) {
            try {
                System.out.println("nhập chủ sỡ hữu");
                chuSoHuu = scanner.nextLine();
                if (!chuSoHuu.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return chuSoHuu;


    }

    public int soChoNgoi() {
        int soChoNgoi;
        while (true) {
            try {
                System.out.println("nhập số chỗ ngồi");
                soChoNgoi = Integer.parseInt(scanner.nextLine());
                if (soChoNgoi > 0 && soChoNgoi < 30) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return soChoNgoi;


    }

    public String kieuXe() {
        String kieuXe;
        while (true) {
            try {
                System.out.println("nhập kiểu xe");
                kieuXe = scanner.nextLine();
                if (!kieuXe.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return kieuXe;


    }
    public String congSuat() {
        String congSuat;
        while (true) {
            try {
                System.out.println("nhập công suất");
                congSuat = scanner.nextLine();
                if (!congSuat.trim().equals("")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return congSuat;


    }
    public double trongTai() {
        double trongTai;
        while (true) {
            try {
                System.out.println("nhập công suất");
                trongTai =Double.parseDouble(scanner.nextLine());
                break;

            } catch (Exception e) {
                System.err.println("Loi nhap");
            }
        }
        return trongTai;


    }
}
