package FuramaResort.services.impl;


import FuramaResort.models.Facility;
import FuramaResort.models.House;
import FuramaResort.models.Room;
import FuramaResort.models.Villa;
import FuramaResort.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> myMap = new LinkedHashMap<>();
        Set<Map.Entry<Facility, Integer>> entrySet = myMap.entrySet();

    static {
        myMap.put(new Villa("Massage", 50.2, 60.33, 3, "Villa", "VIP ", 20.3 , 5 ) , 1 );
        myMap.put( new Room("CÂU CÁ", 55.3, 70.33, 3, "ROOM", "ĂN UỐNG") , 1);
        myMap.put( new House("ĐI CHƠI", 50.2, 60.33, 3, "Villa", "VIP", 3) , 1);

    }


    @Override
    public void disPlay() {
        int count = 0;
        for (Map.Entry<Facility, Integer> entry : entrySet) {
            System.out.println(entry.getKey());
            count++;
        }
        System.out.println("Số lượng Booking : " + count);
    }
    //    String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiThueToiDa, String kieuThue,
//    String tieuChuanPhong, double dienTichHoBoi, int soTang
    @Override
    public void addVilla() {
        Map<Villa , Integer> villaIntegerMap = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên dịch vụ");
    }

    @Override
    public void addRoom() {

    }

    @Override
    public void addHouse() {

    }




}
