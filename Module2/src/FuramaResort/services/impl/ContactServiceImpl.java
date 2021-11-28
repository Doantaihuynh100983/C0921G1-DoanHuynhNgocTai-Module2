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
     Queue<Contract> contracts = new LinkedList<>();
     Queue<Booking> bookings = new LinkedList<>();

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
        for (Contract contract : contracts){
            System.out.println(contract);
        }

    }

    @Override
    public void edit(String hoTen) {
        for (Contract contract : contracts){
            if (contract.getMaBooking().equals(hoTen)){
                System.out.println("Nhập số mã hợp  đồng");
                contract.setSoHopDong(scanner.nextLine());
                System.out.println("Nhập số tiền cọc trước");
                contract.setSoTienCocTruoc(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập số tiền thanh toáng");
                contract.setTongSoTienThanhToan(Integer.parseInt(scanner.nextLine()));



                System.out.println(contract);

            }
        }
        }
      }




