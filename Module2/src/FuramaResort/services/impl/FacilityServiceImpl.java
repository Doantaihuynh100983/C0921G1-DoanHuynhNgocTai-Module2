package FuramaResort.services.impl;


import FuramaResort.models.Facility;
import FuramaResort.models.House;
import FuramaResort.models.Room;
import FuramaResort.models.Villa;
import FuramaResort.services.FacilityService;
import FuramaResort.validate.ValidateFacility;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> myMap = new LinkedHashMap<>();
        Set<Map.Entry<Facility, Integer>> entrySet = myMap.entrySet();

    static {
        myMap.put(new Villa("Massage", 50.2, 60.33, 3, "Villa", "VIP ", 20.3, 5), 1);
        myMap.put(new Room("CÂU CÁ", 55.3, 70.33, 3, "ROOM", "ĂN UỐNG"), 1);
        myMap.put(new House("ĐI CHƠI", 50.2, 60.33, 3, "Villa", "VIP", 3), 1);

    }


    @Override
    public void disPlay() {
        for (Map.Entry<Facility, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " - " + " Số Lần Booking Đã Được Sử Dụng " + entry.getValue());
        }
    }


    Scanner scanner = new Scanner(System.in);
    ValidateFacility valiDate = new ValidateFacility();
    @Override
    public void addVilla() {
        Villa villa1 = new Villa();
        System.out.println("Mời nhập tên dịch vụ");
        villa1.setTenDichVu(valiDate.tenDichVu());
        System.out.println("Mời nhập diện tích sử dụng");
        villa1.setDienTichSuDung(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập chi phí thuê");
        villa1.setChiPhiThue(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập số lượng thuê tối đa");
        villa1.setSoLuongNguoiThueToiDa(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời nhập kiểu thuê");
        villa1.setKieuThue(scanner.nextLine());
        System.out.println("Mời nhập tiêu chuẩn phòng");
        villa1.setTieuChuanPhong(scanner.nextLine());
        System.out.println("Mời nhập diện tích hồ bơi ");
        villa1.setDienTichHoBoi(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập số tầng");
        villa1.setSoTang(Integer.parseInt(scanner.nextLine()));


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
        System.out.println("Mời nhập tên dịch vụ");
        room1.setTenDichVu(scanner.nextLine());
        System.out.println("Mời nhập diện tích sử dụng");
        room1.setDienTichSuDung(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập chi phí thuê");
        room1.setChiPhiThue(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập số lượng người thuê tối đa");
        room1.setSoLuongNguoiThueToiDa(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời nhập kiểu thuê");
        room1.setKieuThue(scanner.nextLine());
        System.out.println("Mời nhập dịch vụ miễn phí đi kèm");
        room1.setDichVuMienPhiDiKem(scanner.nextLine());

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
        System.out.println("Mời nhập tên dịch vụ");
        house1.setTenDichVu(scanner.nextLine());
        System.out.println("Mời nhập diện tích sử dụng");
        house1.setDienTichSuDung(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập chi phí thuê");
        house1.setChiPhiThue(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập số lượng người thuê tối đa");
        house1.setSoLuongNguoiThueToiDa(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời nhập kiểu thuê");
        house1.setKieuThue(scanner.nextLine());
        System.out.println("Mời nhập tiêu chuẩn phòng");
        house1.setTieuChuanPhong(scanner.nextLine());
        System.out.println("Mời nhập tiêu chuẩn phòng");
        house1.setSoTang(Integer.parseInt(scanner.nextLine()));


        if (myMap.containsKey(house1)) {
            int currentValue = myMap.get(house1);
            myMap.put(house1, currentValue + 1);
        } else {
            myMap.put(house1, 1);
        }
        disPlay();

    }
}
