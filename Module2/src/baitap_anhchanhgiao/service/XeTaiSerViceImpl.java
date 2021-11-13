package baitap_anhchanhgiao.service;

import baitap_anhchanhgiao.models.HangSanXuat;
import baitap_anhchanhgiao.models.PhuongTien;
import baitap_anhchanhgiao.models.XeMay;
import baitap_anhchanhgiao.models.XeTai;
import baitap_anhchanhgiao.service.serviceImpl.XeTaiSerVice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiSerViceImpl implements XeTaiSerVice {
    HangSanXuat hangSanXuat = new HangSanXuat();
        static List<XeTai> xeTai = new ArrayList<>();
        static {
            XeTai xeTai1 = new XeTai("43C-45.2345","HSX-003 \t"+"Hino \t"+"Trung Quốc \t",2021,"Nguyễn Văn G",12);
            XeTai xeTai2 = new XeTai("43C-47.678","HSX-003 \t"+"Dongfeng \t"+"Hàn Quốc \t",2021,"Nguyễn Văn H ",12);
            XeTai xeTai3 = new XeTai("43C-45.235","HSX-005 \t"+"Hino \t"+"Mỹ \t" ,2021,"Nguyễn Văn J",12);

            xeTai.add(xeTai1);
            xeTai.add(xeTai2);
            xeTai.add(xeTai3);
        }
    @Override
    public void add() {
        XeTai xeTai1 = new XeTai();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển kiểm soát");
        xeTai1.setBienKiemSoat(scanner.nextLine());
        System.out.println("Mời chọn hãng sản xuất :");
        hangSanXuat.menuHangSanXuat();
        xeTai1.setTenHangSanXuat(hangSanXuat.hangSanXuat1());
        System.out.println("nhập năm sản xuất");
        xeTai1.setNamSanXuat(Integer.parseInt(scanner.nextLine()));
        System.out.println("nhập chủ sỡ hữu");
        xeTai1.setChuSoHuu(scanner.nextLine());
        System.out.println("nhập trọng tải");
        xeTai1.setTrongTai(Double.parseDouble(scanner.nextLine()));

        xeTai.add(xeTai1);
        for (XeTai xetai : xeTai){
            System.out.println(xetai);
        }
    }



    @Override
    public void disPlay() {
            for (XeTai xetai : xeTai){
                System.out.println(xetai);
            }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < xeTai.size(); i++) {
            if (xeTai.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                xeTai.remove(xeTai.get(i));
            }
        }
    }

    @Override
    public boolean check(String bienKiemSoat) {
        for (XeTai ele : xeTai) {
            if (bienKiemSoat.equals(ele.getBienKiemSoat())) {
                return true;
            }
        }
        return false;
    }




}
