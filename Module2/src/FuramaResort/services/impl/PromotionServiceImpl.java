package FuramaResort.services.impl;


import FuramaResort.models.Booking;
import java.util.Set;
import java.util.TreeSet;

public class PromotionServiceImpl {
    BookingServiceImpl bookingService = new BookingServiceImpl();
    Set<Booking> bookings = new TreeSet<>(new BookingComparator());

    public void danhSachKhachHang(String nhapNam) {
        bookings.addAll(bookingService.booKing());
        for (Booking booking : bookings){
           String[] ngay =  booking.getNgayBatDau().split("/");
           if (ngay[2].equals(nhapNam)){
               System.out.println(booking);
           }
        }
    }




}