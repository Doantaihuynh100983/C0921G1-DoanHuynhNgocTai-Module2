package FuramaResort.services.impl;


import FuramaResort.models.Booking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PromotionServiceImpl {

    public void khachHang() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        String[] strings = bookingService.ngayBatDau().split("/");
        for (String string : strings) {
            System.out.println(string);
        }
        bookingService.disPlay();
    }

}
