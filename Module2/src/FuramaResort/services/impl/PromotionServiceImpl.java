package FuramaResort.services.impl;


import FuramaResort.models.Booking;
import FuramaResort.models.Customer;
import bookmanager.Book;

import java.util.*;

public class PromotionServiceImpl {
    BookingServiceImpl bookingService = new BookingServiceImpl();
    Set<Booking> bookings = new TreeSet<>(new BookingComparator());
      CustomerServiceImpl customerService = new CustomerServiceImpl();
      List<Customer> customerList =customerService.customers();
      Customer customer = new Customer();
    public void danhSachKhachHang(String nhapNam) {
        bookings.addAll(bookingService.booKing());
        for (Booking booking : bookings){
            for (Customer customes : customerList) {
                String[] ngay = booking.getNgayBatDau().split("/");
                if (ngay[2].equals(nhapNam)) {
                   if (booking.getMaKhachHang().equals(customes.getMaSo())){
                       System.out.println(customes);
                   }
                }
            }
        }
    }

    Scanner scanner = new Scanner(System.in);
    public void voucherKhuyenMai(){
        Stack<Booking> vocher = new Stack<>();
        vocher.addAll(bookingService.ngayThang());
        for (Booking v :vocher){
            System.out.println(v);
        }
        System.out.println("Nhập Số Lượng VouCher 10%");
        int vouCher10 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số Lượng VouCher 20%%");
        int vouCher20 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số Lượng VouCher 50%%");
        int vouCher50 = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i < vouCher10 ; i++){
                if (!vocher.isEmpty()){
                    customer.setMaSo(vocher.pop().getMaKhachHang());
                    int index = customerList.indexOf(customer);
                    if (index!= -1){
                        System.out.println(customerList.get(index) + "voucher 10%");
                    }
                }
        }
        for (int i = 0 ; i < vouCher20 ; i++){
            if (!vocher.isEmpty()){
                customer.setMaSo(vocher.pop().getMaKhachHang());
                int index = customerList.indexOf(customer);
                if (index!= -1){
                    System.out.println(customerList.get(index) + "voucher 20%");
                }
            }
        }
        for (int i = 0 ; i < vouCher50 ; i++){
            if (!vocher.isEmpty()){
                customer.setMaSo(vocher.pop().getMaKhachHang());
                int index = customerList.indexOf(customer);
                if (index!= -1){
                    System.out.println(customerList.get(index) + "voucher 50%");
                }
            }
        }
    }




}