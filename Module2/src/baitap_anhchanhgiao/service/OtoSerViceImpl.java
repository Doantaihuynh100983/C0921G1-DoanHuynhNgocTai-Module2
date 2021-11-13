package baitap_anhchanhgiao.service;


import baitap_anhchanhgiao.models.*;
import baitap_anhchanhgiao.service.serviceImpl.GiaoThong;
import baitap_anhchanhgiao.service.serviceImpl.OtoSerVice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OtoSerViceImpl implements OtoSerVice {
    HangSanXuat hangSanXuat = new HangSanXuat();
    static List<Oto> oto = new ArrayList<Oto>();

    static {
        Oto oto1 = new Oto("43C-012.343", " HSX-001 \t" + "Toyota \t" + "Nhật Bản \t", 2019, "Nguyễn Văn A", 3, "Xe khách");
        Oto oto2 = new Oto("43C-47.678", "HSX-001 \t" + "Huyndai \t" + "Nhật Bản \t", 2020, "Nguyễn Văn A", 9, "du lịch");
        Oto oto3 = new Oto("43C-012.34", "HSX-001 \t" + "Ford \t" + "Nhật Bản \t", 2019, "Nguyễn Văn Ac", 3, "Xe khách");

        oto.add(oto1);
        oto.add(oto2);
        oto.add(oto3);
    }

    @Override
    public void add() {

        Oto newOto = new Oto();

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số");
        newOto.setBienKiemSoat(scanner.nextLine());
        hangSanXuat.menuHangSanXuat();
        System.out.println("chọn nhà sản xuất");
        newOto.setTenHangSanXuat(hangSanXuat.hangSanXuat1());
        System.out.println("nhập năm sản xuất");
        newOto.setNamSanXuat(Integer.parseInt(scanner.nextLine()));
        System.out.println("nhập chủ sỡ hữu");
        newOto.setChuSoHuu(scanner.nextLine());
        System.out.println("nhập số chỗ ngồi");
        newOto.setSoChoNgoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("nhập kiểu xe");
        newOto.setKieuXe(scanner.nextLine());

        oto.add(newOto);
        disPlay();

    }

    @Override
    public void disPlay() {
        int id = 1 ;
        for (Oto o : oto) {
            System.out.print(id++ +"\t");
            System.out.println(o);
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < oto.size(); i++) {
            if (oto.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                oto.remove(oto.get(i));
            }
        }
    }

    @Override
    public boolean check(String bienKiemSoat) {
        for (Oto ele : oto) {
            if (bienKiemSoat.equals(ele.getBienKiemSoat())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkSearch(String chuSoHuu) {
        for (Oto oto1 : oto){
            if (chuSoHuu.equalsIgnoreCase(oto1.getChuSoHuu())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void search(String chuSoHuu) {
            for (int i = 0 ; i < oto.size() ; i++){
                if (chuSoHuu.equalsIgnoreCase(oto.get(i).getChuSoHuu())){
                    System.out.println(oto.get(i));
                }
            }
    }


}
