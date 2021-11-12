package baitap_anhchanhgiao.service;

import baitap_anhchanhgiao.models.XeTai;
import baitap_anhchanhgiao.service.serviceImpl.XeTaiSerVice;

import java.util.ArrayList;

public class XeTaiSerViceImpl implements XeTaiSerVice {
        static ArrayList<XeTai> xeTai = new ArrayList<>();
        static {
            XeTai xeTai1 = new XeTai("43C-45.235","Hino",2021,"Nguyễn Văn C",12);
            XeTai xeTai2 = new XeTai("43C-47.678","Dongfeng",2021,"Nguyễn Văn B",12);
            XeTai xeTai3 = new XeTai("43C-45.235","Hino",2021,"Nguyễn Văn a",12);

            xeTai.add(xeTai1);
            xeTai.add(xeTai2);
            xeTai.add(xeTai3);
        }
    @Override
    public void add() {

    }

    @Override
    public void disPlay() {
            for (XeTai xetai : xeTai){
                System.out.println(xetai);
            }
    }

    @Override
    public void delete() {

    }
}
