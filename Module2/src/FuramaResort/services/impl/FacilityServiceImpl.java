package FuramaResort.services.impl;


import FuramaResort.models.Facility;
import FuramaResort.models.House;
import FuramaResort.models.Room;
import FuramaResort.models.Villa;
import FuramaResort.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    static Map<Integer, Facility> myMap = new LinkedHashMap<>();


    static {
        myMap.put(1, new Villa("Massage", 50.2, 60.33, 3, "Villa", "VIP", 20.3, 5));
        myMap.put(2, new Room("CÂU CÁ", 55.3, 70.33, 3, "ROOM", "ĂN UỐNG"));
        myMap.put(3, new House("ĐI CHƠI", 50.2, 60.33, 3, "Villa", "VIP", 3));

    }

    Set<Map.Entry<Integer, Facility>> entrySet = myMap.entrySet();

    @Override
    public void disPlay() {
        int count = 0;
        for (Map.Entry<Integer, Facility> entry : entrySet) {
            System.out.println(entry);
            count++;
        }
        System.out.println("Số lượng Booking : " + count);
    }

    @Override
    public void add() {

    }

    @Override
    public void edit(String hoTen) {

    }
}
