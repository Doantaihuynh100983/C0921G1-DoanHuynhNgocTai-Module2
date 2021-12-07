package thi_module2.service;

import FuramaResort.common.WriteReadFile;
import thi.common.ReadWirteFile;
import thi.models.TaiKhoanNganHang;
import thi.models.TaiKhoanThanhToan;
import thi.models.TaiKhoanTietKiem;
import thi_module2.commons.WriteReadFils;
import thi_module2.models.DienThoai;
import thi_module2.models.DienThoaiChinhHang;
import thi_module2.models.DienThoaiXachTay;
import thi_module2.vallidate.Validate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

    public class DienThoaiServiceImpl implements DienThoaiService{
    List<DienThoai> dienThoaiList = new ArrayList<>();
    public  static final String FILE_NAME = "Module2/src/thi_module2/data/mobiles.csv";
    Scanner scanner = new Scanner(System.in);
    {
        dienThoaiList = covertStringToEmployee();
    }
    @Override
    public void addChinhHang() {
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang();
        System.out.println("Mời nhập ID");
        dienThoaiChinhHang.setId(scanner.nextLine());
        dienThoaiChinhHang.setTenDienThoai(Validate.tenDienThoai());
        dienThoaiChinhHang.setGiaBan(Validate.giaBan());
        dienThoaiChinhHang.setSoLuong(Validate.soLuong());
        dienThoaiChinhHang.setNhaSanXuat(Validate.nhaSanXuat());
        dienThoaiChinhHang.setThoiGianBaoHanh(Validate.thoiGianBaoHang());
        System.out.println("Mời chọn phạm vi bảo hành");
        System.out.println("1.trong nước, 2.quốc tế");
        int choice1 = scanner.nextInt();
        switch (choice1) {
            case 1:
                dienThoaiChinhHang.setPhamViBanHanh("Trong Nước");
                break;
            case 2:
                dienThoaiChinhHang.setPhamViBanHanh("Nước NGoài");
                break;

        }
            dienThoaiList.add(dienThoaiChinhHang);
         List<String> stringList = new ArrayList<>();
         stringList.add(dienThoaiChinhHang.toString());
        WriteReadFils.writeFile(FILE_NAME, stringList, true);
    }

    @Override
    public void addXachTay() {
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay();
        System.out.println("Mời nhập ID");
        dienThoaiXachTay.setId(scanner.nextLine());
        dienThoaiXachTay.setTenDienThoai(Validate.tenDienThoai());
        dienThoaiXachTay.setGiaBan(Validate.giaBan());
        dienThoaiXachTay.setSoLuong(Validate.soLuong());
        dienThoaiXachTay.setNhaSanXuat(Validate.nhaSanXuat());
        dienThoaiXachTay.setQuocGiaXachTay(Validate.quocGiaBaoHanh());
        dienThoaiXachTay.setTrangThai(Validate.trangThai());
        dienThoaiXachTay.setSoDu(Validate.soDuTrongThang());

        dienThoaiList.add(dienThoaiXachTay);
        List<String> stringList = new ArrayList<>();
        stringList.add(dienThoaiXachTay.toString());
        WriteReadFils.writeFile(FILE_NAME, stringList, true);
    }
    @Override
    public void disPlay() {
        for (DienThoai dienThoai : dienThoaiList) {
            System.out.println(dienThoai);
        }
    }

    @Override
    public void delete(String ID) {
        for (int i = 0; i < dienThoaiList.size(); i++) {
            if (dienThoaiList.get(i).getId().equals(ID)){
                dienThoaiList.remove(dienThoaiList.get(i));
            }

        }
        List<String> stringList = covertEmployeeToString();
        WriteReadFils.writeFile(FILE_NAME, stringList, false);
    }

    @Override
    public void search(String tenDienThoai) {
        for (int i = 0; i < dienThoaiList.size(); i++) {
            if (checkDeleteID(tenDienThoai) || checkSearchID(tenDienThoai)) {
                if (dienThoaiList.get(i).getId().contains(tenDienThoai)
                        || dienThoaiList.get(i).getTenDienThoai().contains(tenDienThoai))
                    System.out.println(dienThoaiList.get(i));
            }
        }
    }

    @Override
    public boolean checkSearchID(String tenDienThoai) {
        for (DienThoai dienThoai : dienThoaiList) {
            if (dienThoai.getTenDienThoai().contains(tenDienThoai)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkDeleteID(String ID) {
        for (DienThoai dienThoai : dienThoaiList) {
            if (dienThoai.getId().contains(ID)) {
                return true;
            }
        }
        return false;
    }

    public List<DienThoai> covertStringToEmployee() {
        List<String> stringList = WriteReadFils.readFile(FILE_NAME);
        List<DienThoai> dienThoais = new ArrayList<>();
        String[] arrdienThoais;
        for (String line : stringList) {
            arrdienThoais = line.split(",");
            if (arrdienThoais.length == 7) {
                dienThoais.add(new DienThoaiChinhHang(arrdienThoais[0], arrdienThoais[1], Double.parseDouble(arrdienThoais[2]),
                        Integer.parseInt(arrdienThoais[3]), arrdienThoais[4] , Integer.parseInt(arrdienThoais[5]) ,arrdienThoais[6]));
            }
//            String id, String tenDienThoai, double giaBan,
//            int soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai
            if (arrdienThoais.length == 8) {
                dienThoais.add(new DienThoaiXachTay(arrdienThoais[0], arrdienThoais[1], Double.parseDouble(arrdienThoais[2]),
                        Integer.parseInt(arrdienThoais[3]), arrdienThoais[4], arrdienThoais[5],arrdienThoais[6],arrdienThoais[7]));
            }
        }
        return dienThoais;
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new LinkedList<>();
        for (DienThoai dienThoai : dienThoaiList) {
            listString.add(dienThoai.toString());
        }
        return listString;
    }
}
