package FuramaResort.services.impl;


public class PromotionServiceImpl {
    BookingServiceImpl bookingService = new BookingServiceImpl();
    public void danhSachKhachHang(){
        bookingService.disPlay();
        bookingService.booKing();
    }

}
