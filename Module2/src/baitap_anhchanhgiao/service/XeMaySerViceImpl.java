package baitap_anhchanhgiao.service;

import baitap_anhchanhgiao.models.XeMay;
import baitap_anhchanhgiao.service.serviceImpl.XeMaySerVice;

import java.util.ArrayList;

public class XeMaySerViceImpl implements XeMaySerVice {
  static  ArrayList<XeMay> xeMay = new ArrayList<>();
    static{
        XeMay xeMay1 = new XeMay("43-K1-678.56","Yamaha",2019,"Nguyễn Văn A","100");
        XeMay xeMay2 = new XeMay("43-K1-678.56","Yamaha",2019,"Nguyễn Văn A","100");
        XeMay xeMay3 = new XeMay("43-K1-678.56","Yamaha",2019,"Nguyễn Văn A","100");

        xeMay.add(xeMay1);
        xeMay.add(xeMay2);
        xeMay.add(xeMay3);

    }
    @Override
    public void add() {

    }

    @Override
    public void disPlay() {
        for (XeMay xemay : xeMay){
            System.out.println(xemay);
        }
    }

    @Override
    public void delete() {

    }
}
