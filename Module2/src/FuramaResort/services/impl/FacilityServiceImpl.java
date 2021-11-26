package FuramaResort.services.impl;


import FuramaResort.models.Facility;
import FuramaResort.models.House;
import FuramaResort.models.Room;
import FuramaResort.models.Villa;
import FuramaResort.services.FacilityService;
import FuramaResort.validate.ValidateFacility;


import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> myMap = new LinkedHashMap<>();
    Set<Map.Entry<Facility, Integer>> entrySet = myMap.entrySet();

    static {
        myMap.put(new Villa("SVVL-0009", "Villa", 50.2, 60.33, 3, "Tháng", "VIP ", 20.3, 5), 1);
        myMap.put(new Room("HOVL-0009", "Room", 55.3, 70.33, 3, "Năm", "ĂN UỐNG"), 1);
        myMap.put(new House("ROVL-0009", "House", 50.2, 60.33, 3, "Ngày", "VIP", 3), 1);

    }


    @Override
    public void disPlay() {
        for (Map.Entry<Facility, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " - " + " Số Lần Booking Đã Được Sử Dụng " + entry.getValue());
        }
    }









    ValidateFacility valiDate = new ValidateFacility();
    @Override
    public void addVilla() {
        Villa villa1 = new Villa();
        villa1.setMaDichVu(valiDate.maVilla());
        villa1.setTenDichVu(valiDate.tenDichVu());
        villa1.setDienTichSuDung(valiDate.dienTichSuDung());
        villa1.setChiPhiThue(valiDate.chiPhiThue());
        villa1.setSoLuongNguoiThueToiDa(valiDate.soLuongNguoiThue());
        villa1.setKieuThue(valiDate.kieuThue());
        villa1.setTieuChuanPhong(valiDate.tieuChuanPhong());
        villa1.setDienTichHoBoi(valiDate.dienTichHoBoi());
        villa1.setSoTang(valiDate.soTang());

        if (myMap.containsKey(villa1)) {
            int currentValue = myMap.get(villa1);
            myMap.put(villa1, currentValue + 1);
        } else {
            myMap.put(villa1, 1);
        }
        disPlay();

    }


    @Override
    public void addRoom() {
        Room room1 = new Room();
        room1.setMaDichVu(valiDate.maRoom());
        room1.setTenDichVu(valiDate.tenDichVu());
        room1.setDienTichSuDung(valiDate.dienTichSuDung());
        room1.setChiPhiThue(valiDate.chiPhiThue());
        room1.setSoLuongNguoiThueToiDa(valiDate.soLuongNguoiThue());
        room1.setKieuThue(valiDate.kieuThue());
        room1.setDichVuMienPhiDiKem(valiDate.dichVuDiKem());

        if (myMap.containsKey(room1)) {
            int currentValue = myMap.get(room1);
            myMap.put(room1, currentValue + 1);
        } else {
            myMap.put(room1, 1);
        }
        disPlay();
    }


    @Override
    public void addHouse() {
        House house1 = new House();
        house1.setMaDichVu(valiDate.maHouse());
        house1.setTenDichVu(valiDate.tenDichVu());
        house1.setDienTichSuDung(valiDate.dienTichSuDung());
        house1.setChiPhiThue(valiDate.chiPhiThue());
        house1.setSoLuongNguoiThueToiDa(valiDate.soLuongNguoiThue());
        house1.setKieuThue(valiDate.kieuThue());
        house1.setTieuChuanPhong(valiDate.tieuChuanPhong());
        house1.setSoTang(valiDate.soTang());

        if (myMap.containsKey(house1)) {
            int currentValue = myMap.get(house1);
            myMap.put(house1, currentValue + 1);
        } else {
            myMap.put(house1, 1);
        }
        disPlay();

    }


}
