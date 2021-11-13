package baitap_anhchanhgiao.service.serviceImpl;

import baitap_anhchanhgiao.models.PhuongTien;

import java.util.List;

public interface GiaoThong {
    void add();

    void disPlay();

    void delete(String bienKiemSOat);

    boolean check(String bienKiemSoat);

    boolean checkSearch(String chuSoHuu);

    void search(String chuSoHuu);




}
