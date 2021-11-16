package baitap_anhchanhgiao.service;

import baitap_anhchanhgiao.models.HangSanXuat;
import baitap_anhchanhgiao.models.XeTai;
import baitap_anhchanhgiao.service.serviceImpl.XeTaiSerVice;
import baitap_anhchanhgiao.validate.ValiDate;

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
        ValiDate valiDate = new ValiDate();
        xeTai1.setBienKiemSoat( valiDate.bienKiemSoat());
        hangSanXuat.menuHangSanXuat();
        System.out.println("chọn nhà sản xuất");
        xeTai1.setTenHangSanXuat(hangSanXuat.hangSanXuat1());
        xeTai1.setNamSanXuat(valiDate.namSanXuat());
        xeTai1.setChuSoHuu(valiDate.chuSoHuu());
        xeTai1.setTrongTai(valiDate.trongTai());


        xeTai.add(xeTai1);
        disPlay();
    }



    @Override
    public void disPlay() {
            int id = 1 ;
            for (XeTai xetai : xeTai){
                System.out.print(id++ + "\t");
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

    @Override
    public boolean checkSearch(String chuSoHuu) {
            for (XeTai xetai : xeTai){
                if (chuSoHuu.equalsIgnoreCase(xetai.getChuSoHuu())){
                    return true;
                }
            }
        return false;
    }

    @Override
    public void search(String chuSoHuu) {
            for (int i = 0 ; i < xeTai.size();i++){
                if (xeTai.get(i).getChuSoHuu().equalsIgnoreCase(chuSoHuu)){
                    System.out.println(xeTai.get(i));
                }
            }

    }


}
