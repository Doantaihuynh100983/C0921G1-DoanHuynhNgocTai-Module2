package bai_lam_them_anhChanh_giao_2.services;

import bai_lam_them_anhChanh_giao_2.models.KhachHangNuocNgoai;
import bai_lam_them_anhChanh_giao_2.models.KhachHangVietNam;
import bai_lam_them_anhChanh_giao_2.models.QuanLyTienDien;
import test_doc_ghi_file.FileUntiels;
import test_doc_ghi_file.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachHangNuocNgoaiImpl implements NganHang {
    KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai();


    static List<QuanLyTienDien> khachHangNuocNgoais = new ArrayList<>();

    static {
        khachHangNuocNgoais.add(new KhachHangNuocNgoai("KHNN-00001", "Cristiano Ronaldo", "Portugal"));
        khachHangNuocNgoais.add(new KhachHangNuocNgoai("KHNN-00002", "Djamel Belmadi", "Fulham"));
        khachHangNuocNgoais.add(new KhachHangNuocNgoai("KHNN-00004", "\tAli Benarbia", "Craven Cottage"));
    }

    @Override
    public void add() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập mã khách hàng");
        khachHangNuocNgoai.setMaKhachHang(scanner.nextLine());
        System.out.println("Mời tên khách hàng");
        khachHangNuocNgoai.setHoTen(scanner.nextLine());
        System.out.println("Mời quốc gia");
        khachHangNuocNgoai.setQuocGia(scanner.nextLine());

        khachHangNuocNgoais.add(khachHangNuocNgoai);
        disPlay();
    }

    @Override
    public void disPlay() {
        for (QuanLyTienDien khachHangNuocNgoai : khachHangNuocNgoais) {
            System.out.println(khachHangNuocNgoai);
        }
//        docGhiFile();
//        List<String> listLine =fileUntiels.readFile(File_Name);
//        for (String lScanner : listLine){
//            System.out.println(lScanner);
//        }
    }

    @Override
    public void search(String nameKhachHang) {
        for (int i = 0; i < khachHangNuocNgoais.size(); i++) {
            if (khachHangNuocNgoais.get(i).getHoTen().equals(nameKhachHang)) {
                System.out.println(khachHangNuocNgoais.get(i));
            }
        }
    }

    @Override
    public boolean checkSearch(String nameKhachHang) {
        for (int i = 0; i < khachHangNuocNgoais.size(); i++) {
            if (khachHangNuocNgoais.get(i).getHoTen().equals(nameKhachHang)) {
                return true;
            }
        }
        return false;
    }

    public String khachHangNuocNgoai() {
        Scanner scanner = new Scanner(System.in);
        disPlay();
        int choice = Integer.parseInt(scanner.nextLine());

        return khachHangNuocNgoais.get(choice - 1).getMaKhachHang();
    }


//    final String File_Name = "Module2/src/test_doc_ghi_file/data/Student.csv";
//    final String ComMa = ",";
//    String line = null;
//    FileUntiels fileUntiels = new FileUntiels();
//
//    public void docGhiFile() {
//        for (KhachHangNuocNgoai khachHangNuocNgoai : khachHangNuocNgoais) {
//            line = khachHangNuocNgoai.getHoTen() + ComMa + khachHangNuocNgoai.getMaKhachHang() + ComMa + khachHangNuocNgoai.getQuocGia();
//
//            fileUntiels.writeFile(File_Name, line);
//        }
//
//
//    }
}