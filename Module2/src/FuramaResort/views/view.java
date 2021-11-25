package FuramaResort.views;

import FuramaResort.controllers.FuramaController;
import FuramaResort.models.Booking;
import FuramaResort.services.impl.BookingServiceImpl;

public class view {
    public static void main(String[] args) {

        FuramaController c = new FuramaController();
        c.menu();
    }
}
