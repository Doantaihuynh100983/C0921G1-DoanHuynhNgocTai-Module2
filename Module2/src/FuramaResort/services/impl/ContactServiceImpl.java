package FuramaResort.services.impl;

import FuramaResort.models.Booking;
import FuramaResort.models.Contract;
import FuramaResort.services.ContactService;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    BookingServiceImpl bookingService = new BookingServiceImpl();

    Scanner scanner = new Scanner(System.in);
    static Queue<Contract> contracts = new LinkedList<>();
    static  Queue<Booking> bookings = new LinkedList<>();

    static {
        contracts.add(new Contract("0001", "BK001", 5.3, 5.0, "CTM0001"));
        contracts.add(new Contract("0002", "BK002", 5.3, 5.0, "CTM0002"));
        contracts.add(new Contract("0003", "BK003", 5.3, 5.0, "CTM0003"));


    }

    @Override
    public void disPlay() {
        for (Contract contract : contracts) {
            System.out.println(contract);
        }

    }

    @Override
    public void add() {
        bookings.addAll(bookingService.booKing());
        Booking booking = bookings.poll();
        System.out.println(booking);
        String maBooking = booking.getMaBooking();
        String maKhachHang = booking.getMaKhachHang();
        System.out.println("Nhập mã hợp đồng");
        String maHopDong = scanner.nextLine();
        System.out.println("Nhập số tiền cọc trước");
        int tienCoc = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tiền cọc trước");
        int soTienThanhToan = Integer.parseInt(scanner.nextLine());

        contracts.add(new Contract(maHopDong ,maBooking , tienCoc ,  soTienThanhToan , maKhachHang));

    }

    @Override
    public void edit(String hoTen) {


        }
    }



