package FuramaResort.services.impl;

import FuramaResort.models.Contract;
import FuramaResort.services.ContactService;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
        BookingServiceImpl bookingService = new BookingServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    Scanner scanner = new Scanner(System.in);
    static Queue<Contract> contracts = new LinkedList<>();
    static  List<Contract> contractList = new LinkedList<>();

    static {
        contracts.add(new Contract("0001", "BK001", 5.3, 5.0, "CTM0001"));
        contracts.add(new Contract("0002", "BK002", 5.3, 5.0, "CTM0002"));
        contracts.add(new Contract("0003", "BK003", 5.3, 5.0, "CTM0003"));

        contractList.addAll(contracts);
    }

    @Override
    public void disPlay() {
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void add() {
        Contract contract1 = new Contract();
        System.out.println("Mời nhập số hợp đồng");
        contract1.setSoHopDong(scanner.nextLine());
        System.out.println("Mời chọn mã Booking ");
        contract1.setMaBooking(bookingService.maBooking());
        System.out.println("Mời nhập số tiền cọc trước");
        contract1.setSoTienCocTruoc(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời nhập tổng tiền thanh toán");
        contract1.setTongSoTienThanhToan(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời chọn mã khách hàng");
        contract1.setMaKhachHang(bookingService.maKhachHang1());

        contractList.add(contract1);
        disPlay();
    }

    @Override
    public void edit(String hoTen) {
        for (int i = 0 ; i < contractList.size() ; i++){
            if (contractList.get(i).getMaBooking().equals(hoTen)){
                System.out.println("Mời nhập số hợp đồng");
                contractList.get(i).setSoHopDong(scanner.nextLine());
                System.out.println("Mời chọn mã Booking ");
                contractList.get(i).setMaBooking(bookingService.maBooking());
                System.out.println("Mời nhập số tiền cọc trước");
                contractList.get(i).setSoTienCocTruoc(Double.parseDouble(scanner.nextLine()));
                System.out.println("Mời nhập tổng tiền thanh toán");
                contractList.get(i).setTongSoTienThanhToan(Double.parseDouble(scanner.nextLine()));
                System.out.println("Mời chọn mã khách hàng");
                contractList.get(i).setMaKhachHang(bookingService.maKhachHang1());
            }

        }
    }


}
