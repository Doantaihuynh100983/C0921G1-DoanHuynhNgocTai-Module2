package FuramaResort.services.impl;


import FuramaResort.models.Booking;
import FuramaResort.services.BookingService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    static Set<Booking> bookings = new TreeSet<>(new BookingComparator());

    static {
        bookings.add(new Booking("BK001", "3/10/2015", "30/10/2019", "CTM001", "villa", "massage"));
        bookings.add(new Booking("BK009", "3/10/2030", "28/10/2019", "CTM0111", "villa3", "lượm luôn"));
        bookings.add(new Booking("BK002", "11/11/2021", "30/10/2019", "CTM002", "chouse", "câu cá"));
        bookings.add(new Booking("BK003", "5/11/2015", "31/12/2019", "CTM003", "room", "đi chơi "));
        bookings.add(new Booking("BK004", "9/10/2020", "9/10/2019", "CTM004", "villa", "đi dạo"));
        bookings.add(new Booking("BK005", "6/10/2019", "9/10/2018", "CTM004", "villa", "massage"));

    }

    @Override
    public void disPlay() {
        for (Booking bookingTreeSets : bookings) {
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
        System.out.println("Nhập tên Dịch Vụ");
        booking1.setTenDichVu(sc.nextLine());
        System.out.println("Chọn Loại Dịch VỤ");
        booking1.setLoaiDichVu(sc.nextLine());

        bookings.add(booking1);
        disPlay();

    }

    @Override
    public void edit(String hoTen) {

    }


    public Set<Booking> booKing(){
        return bookings;
    }






//    public void ngayThang(){
//        Date date = new Date();
//        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        String month = String.valueOf(localDate.getMonthValue());
//
//        for (Booking booking : bookings){
//            String[] ngay =  booking.getNgayBatDau().split("/");
//            if (ngay[1].equals(month)){
//                System.out.println(booking);
//            }
//        }
//
//    }
}
