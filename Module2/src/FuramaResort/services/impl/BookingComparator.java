package FuramaResort.services.impl;

import FuramaResort.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        String[] array = o1.getNgayBatDau().split("/");
        String[] array1 = o2.getNgayBatDau().split("/");
        String[] aStrings = o1.getNgayKetThuc().split("/");
        String[] aStrings2 = o2.getNgayKetThuc().split("/");
        for (int i = 0; i < array.length; i++) {
            if (array[2].compareTo(array1[2]) > 0) {
                return 1;
            } else if (array[2].compareTo(array1[2]) < 0) {
                return -1;
            } else {
                for (int j = 0; j < aStrings.length; j++) {
                    if (aStrings[2].compareTo(aStrings2[2]) > 0) {
                        return 1;
                    } else if (aStrings[2].compareTo(aStrings2[2]) < 0) {
                        return -1;
                    }
                    return 0;
                }
            }
        }
        return 0;
    }
}



