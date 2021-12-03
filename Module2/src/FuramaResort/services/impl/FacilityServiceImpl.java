package FuramaResort.services.impl;


import FuramaResort.models.*;
import FuramaResort.services.FacilityService;
import FuramaResort.validate.ValidateFacility;


import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> myMap = new LinkedHashMap<>();
    Set<Map.Entry<Facility, Integer>> entrySet = myMap.entrySet();
    BookingServiceImpl bookingService = new BookingServiceImpl();
    static {
        myMap.put(new Villa("SVVL-0000", "Villa", 50.2, 60.33, 3, "Tháng", "Vip ", 20.3, 5), 1);
        myMap.put(new Room("SVRO-0009", "Room", 55.3, 70.33, 3, "Năm", "Vip"), 1);
        myMap.put(new Room("SVRO-0009", "Room", 55.3, 70.33, 3, "Năm", "Vip"), 1);
        myMap.put(new Room("SVRO-0009", "Room", 55.3, 70.33, 3, "Năm", "Vip"), 1);
        myMap.put(new Room("SVRO-0009", "Room", 55.3, 70.33, 3, "Năm", "Vip"), 1);
        myMap.put(new House("SVHO-0009", "House", 50.2, 60.33, 3, "Ngày", "Vip", 3), 5);

    }


    @Override
    public void disPlay() {
        for (Map.Entry<Facility, Integer> entry : entrySet) {
            System.out.println(entry.getKey());
        }

    }


    // mã dịch vụ Facility bằng với tên dịch vụ bên booking
    public void disPlayFacilityMainTenance() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        Set<Booking> bookings = bookingService.ngayThang();
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        for (Booking booking : bookings) {
            for (Map.Entry<Facility, Integer> entry : entrySet) {
                if (entry.getKey().getMaDichVu().equals(booking.getTenDichVu())) {
                    if (!facilityIntegerMap.containsKey(entry.getKey())) {
                        facilityIntegerMap.put(entry.getKey(), 1);
                    } else {
                        facilityIntegerMap.put(entry.getKey(), facilityIntegerMap.get(entry.getKey()) + 1);
                    }
                }
            }
        }
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + " Số Lần Booking Đã Được Sử Dụng " + entry.getValue());
        }

    }


    ValidateFacility valiDate = new ValidateFacility();

    @Override
    public void addVilla() {
        Villa villa1 = new Villa();
        bookingService.disPlay();
        villa1.setMaDichVu(valiDate.maVilla());
        villa1.setTenDichVu(valiDate.tenDichVu());
        villa1.setDienTichSuDung(valiDate.dienTichSuDung());
        villa1.setChiPhiThue(valiDate.chiPhiThue());
        villa1.setSoLuongNguoiThueToiDa(valiDate.soLuongNguoiThue());
        villa1.setKieuThue(valiDate.kieuThue());
        villa1.setTieuChuanPhong(valiDate.tieuChuanPhong());
        villa1.setDienTichHoBoi(valiDate.dienTichHoBoi());
        villa1.setSoTang(valiDate.soTang());
        myMap.put(villa1,1);
        disPlay();

    }


    @Override
    public void addRoom() {
        Room room1 = new Room();
        bookingService.disPlay();
        room1.setMaDichVu(valiDate.maRoom());
        room1.setTenDichVu(valiDate.tenDichVu());
        room1.setDienTichSuDung(valiDate.dienTichSuDung());
        room1.setChiPhiThue(valiDate.chiPhiThue());
        room1.setSoLuongNguoiThueToiDa(valiDate.soLuongNguoiThue());
        room1.setKieuThue(valiDate.kieuThue());
        room1.setDichVuMienPhiDiKem(valiDate.dichVuDiKem());
        myMap.put(room1,1);
        disPlay();
    }


    @Override
    public void addHouse() {
        House house1 = new House();
        bookingService.disPlay();
        house1.setMaDichVu(valiDate.maHouse());
        house1.setTenDichVu(valiDate.tenDichVu());
        house1.setDienTichSuDung(valiDate.dienTichSuDung());
        house1.setChiPhiThue(valiDate.chiPhiThue());
        house1.setSoLuongNguoiThueToiDa(valiDate.soLuongNguoiThue());
        house1.setKieuThue(valiDate.kieuThue());
        house1.setTieuChuanPhong(valiDate.tieuChuanPhong());
        house1.setSoTang(valiDate.soTang());
        myMap.put(house1,1);
        disPlay();

    }


}
