package FuramaResort.services.impl;


import FuramaResort.models.Booking;
import FuramaResort.services.BookingService;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    static Set<Booking> bookings = new TreeSet<>(new BookingComparator());
        static List<Booking> bookingList = new ArrayList<>();

    static {
        bookings.add(new Booking("BK001", "20/10/2019", "30/10/2019", "CTM001", "massage", "villa"));
        bookings.add(new Booking("BK002", "25/10/2021", "30/10/2019", "CTM002", "câu cá", "house"));
        bookings.add(new Booking("BK003", "5/11/2017", "31/12/2019", "CTM003", "đi chơi", "room"));
        bookings.add(new Booking("BK004", "6/1/2020", "9/10/2019", "CTM004", "massage", "villa"));
        bookings.add(new Booking("BK005", "6/1/2020", "9/10/2018", "CTM004", "massage", "villa"));
        bookingList.addAll(bookings);

    }

    @Override
    public void disPlay() {
        for (Booking bookingTreeSets : bookingList) {
            System.out.println(bookingTreeSets);
        }
    }


    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        Booking booking1 = new Booking();
        System.out.println("Nhập mã booking");
        booking1.setMaBooking(sc.nextLine());
        System.out.println("Ngày Bắt Đầu");
        booking1.setNgayBatDau(sc.nextLine());
        System.out.println("Ngày Kết Thúc");
        booking1.setNgayKetThuc(sc.nextLine());
        System.out.println("Chọn mã khách hàng");
        customerService.disPlay();
        booking1.setMaKhachHang(customerService.maKhachHang());
        System.out.println("Chọn tên dịch vụ");
        booking1.setTenDichVu(sc.nextLine());
        System.out.println("Chọn loại dịch vụ");
        booking1.setLoaiDichVu(sc.nextLine());

        bookings.add(booking1);
        disPlay();

    }

    @Override
    public void edit(String hoTen) {

    }

    public String maBooking(){
        disPlay();
        int chocie = sc.nextInt();
        return bookingList.get(chocie -1 ).getMaBooking() ;
    }
    public String maKhachHang1(){
        disPlay();
        int chocie = sc.nextInt();
        return bookingList.get(chocie -1 ).getMaKhachHang() ;
    }

    public String ngayBatDau(){
        int chocie = sc.nextInt();
        return bookingList.get(chocie -1 ).getNgayBatDau() ;
    }
}
