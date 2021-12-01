package FuramaResort.services.impl;


import FuramaResort.common.WriteReadFile;
import FuramaResort.models.Booking;
import FuramaResort.models.Customer;
import FuramaResort.services.BookingService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    Set<Booking> bookings = new TreeSet<>(new BookingComparator());
    public static final String FILE_NAME = "Module2/src/FuramaResort/data/booking.csv";

    //    static {
//        bookings.add(new Booking("BK001", "3/10/2015", "30/10/2019", "CTM001", "SVVL-0000", "massage"));
//        bookings.add(new Booking("BK009", "3/10/2030", "28/10/2019", "CTM0111", "HOVL-0000", "lượm luôn"));
//        bookings.add(new Booking("BK002", "11/11/2021", "30/10/2019", "CTM002", "ROVL-0000", "câu cá"));
//        bookings.add(new Booking("BK003", "5/11/2015", "31/12/2019", "CTM003", "SVVL-0000", "đi chơi "));
//        bookings.add(new Booking("BK004", "9/10/2020", "9/10/2019", "CTM004", "SVVL-0000", "đi dạo"));
//        bookings.add(new Booking("BK005", "6/10/2019", "9/10/2018", "CTM004", "SVVL-0000", "massage"));
//
//    }
    {
        bookings = covertStringToEmployee();
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
        List<String> stringList = new ArrayList<>();
        bookings.add(booking1);
        stringList.add(booking1.toString());
        WriteReadFile.writeFile(FILE_NAME, stringList, true);
        disPlay();

    }

    @Override
    public void edit(String hoTen) {

    }


    public Set<Booking> booKing() {
        return bookings;
    }


    public Set<Booking> covertStringToEmployee() {
        List<String> stringList = WriteReadFile.readFile(FILE_NAME);
        Set<Booking> bookings1 = new TreeSet<>(new BookingComparator());
        String[] arrBooking;
        for (String line : stringList) {
            arrBooking = line.split(",");
            bookings1.add(new Booking(arrBooking[0], arrBooking[1], arrBooking[2],
                    arrBooking[3], arrBooking[4], arrBooking[5]));
        }
        return bookings1;
    }


    public List<String> covertEmployeeToString() {
        List<String> listString = new LinkedList<>();
        for (Booking booking : bookings) {
            listString.add(booking.toString());
        }
        return listString;
    }


    public Set<Booking> ngayThang(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String month = String.valueOf(localDate.getMonthValue() );
        String year = String.valueOf(localDate.getYear());

        Set<Booking> bookingsThang = new LinkedHashSet<>();
        for (Booking booking : bookings){
            String[] ngay =  booking.getNgayBatDau().split("/");
            if (ngay[1].equals(month) && ngay[2].equals(year)){
               bookingsThang.add(booking);
            }
        }
        return bookingsThang;
    }




}
