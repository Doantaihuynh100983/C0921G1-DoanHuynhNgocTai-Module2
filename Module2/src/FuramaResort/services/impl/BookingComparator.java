package FuramaResort.services.impl;

import FuramaResort.models.Booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        Date date1 = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getNgayBatDau());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getNgayBatDau());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            date3 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getNgayKetThuc());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            date4 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getNgayKetThuc());
        } catch (ParseException e) {
            e.printStackTrace();
        }




        if (date1.compareTo(date2) > 0 ){
            return  1 ;
        }else if (date1.compareTo(date2) <0 ){
            return -1 ;
        }
        else{
            if (date3.compareTo(date4) > 0 ){
                return 1;
            }else if (date3.compareTo(date4) < 0){
                return  -1 ;
            }
            return 0;
        }
    }
}



