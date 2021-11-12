package baitap_anhchanhgiao.service;



import baitap_anhchanhgiao.models.Oto;
import baitap_anhchanhgiao.service.serviceImpl.OtoSerVice;

import java.util.ArrayList;


public class OtoSerViceImpl implements OtoSerVice {

    static ArrayList<Oto> oto = new ArrayList<>();
    static {
        Oto oto1 = new Oto("43C-012.34","Toyota",2019,"Nguyễn Văn A",3 , "Xe khách");
        Oto oto2 = new Oto("43C-47.678", "Huyndai",2020 , "Nguyễn Văn B",9,"du lịch");
        Oto oto3 = new Oto("43C-012.34","Ford",2019,"Nguyễn Văn A",3 , "Xe khách");

        oto.add(oto1);
        oto.add(oto2);
        oto.add(oto3);
    }
    @Override
    public void add() {

    }

    @Override
    public void disPlay() {
        for (Oto o : oto){
            System.out.println(o);
        }
    }

    @Override
    public void delete() {

    }


}
