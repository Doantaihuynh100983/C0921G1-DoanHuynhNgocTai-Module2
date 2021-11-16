package baitap_anhchanhgiao.service;

import baitap_anhchanhgiao.models.*;
import baitap_anhchanhgiao.service.serviceImpl.XeMaySerVice;
import baitap_anhchanhgiao.validate.ValiDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMaySerViceImpl implements XeMaySerVice {
    HangSanXuat hangSanXuat = new HangSanXuat();
  static List<XeMay> xeMay = new ArrayList<XeMay>();
    static{
        XeMay xeMay1 = new XeMay("43-K1-678.56","Yamaha",2019,"Nguyễn Văn A","100");
        XeMay xeMay2 = new XeMay("43-K1-678.567","Yamaha",2019,"Nguyễn Văn E","100");
        XeMay xeMay3 = new XeMay("43-K1-678.568","Yamaha",2019,"Nguyễn Văn F","100");

        xeMay.add(xeMay1);
        xeMay.add(xeMay2);
        xeMay.add(xeMay3);

    }

    @Override
    public void add() {
            XeMay xeMay1 = new XeMay();
        ValiDate valiDate = new ValiDate();
        xeMay1.setBienKiemSoat( valiDate.bienKiemSoat());
        hangSanXuat.menuHangSanXuat();
        System.out.println("chọn nhà sản xuất");
        xeMay1.setTenHangSanXuat( hangSanXuat.hangSanXuat1());
        xeMay1.setNamSanXuat(valiDate.namSanXuat());
        xeMay1.setChuSoHuu(valiDate.chuSoHuu());
        xeMay1.setCongSuat(valiDate.congSuat());


        xeMay.add(xeMay1);
        disPlay();

    }

    @Override
    public void disPlay() {
        int id = 1 ;
        for (XeMay xemay : xeMay){
            System.out.print(id++ + "\t");
            System.out.println(xemay);
        }
    }

    @Override
    public void delete(String bienKiemSoat) {
        for (int i = 0; i < xeMay.size(); i++) {
            if (xeMay.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                xeMay.remove(xeMay.get(i));
            }
        }
    }

    @Override
    public boolean check(String bienKiemSoat) {
        for (XeMay ele : xeMay) {
            if (bienKiemSoat.equals(ele.getBienKiemSoat())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkSearch(String chuSoHuu) {
        for (XeMay xemay : xeMay){
            if (chuSoHuu.equalsIgnoreCase(xemay.getChuSoHuu())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void search(String chuSoHuu) {
            for (int i = 0 ; i < xeMay.size() ; i++){
                if (xeMay.get(i).getChuSoHuu().equalsIgnoreCase(chuSoHuu)){
                    System.out.println(xeMay.get(i));
                }
            }
    }

}
