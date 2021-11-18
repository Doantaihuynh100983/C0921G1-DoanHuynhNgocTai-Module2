package FuramaResort.services.impl;

import FuramaResort.models.Customer;
import FuramaResort.services.CustomerService;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    static List<Customer> customers = new LinkedList<>();

    static {
        Customer customer1 = new Customer("TÀI ĐOÀN 4", "10/09/2000", "Nam", 999999999, 777777777, "DoanTai@gmail.com", "Platinium", "nam phuoc");
        Customer customer2 = new Customer("TÀI ĐOÀN 5", "10/09/2000", "Nam", 999999999, 777777777, "DoanTai@gmail.com", "Platinium", "nam phuoc");
        Customer customer3 = new Customer("TÀI ĐOÀN 6", "10/09/2000", "Nam", 999999999, 777777777, "DoanTai@gmail.com", "Platinium", "nam phuoc");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    @Override
    public void disPlay() {
        int id = 1;
        for (Customer customer : customers) {
            System.out.print("CTM" + id++ + "\t");
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Mời nhập họ tên");
        customer.setHoTen(sc.nextLine());
        System.out.println("Mời nhập ngày sinh");
        customer.setNgaySinh(sc.nextLine());
        System.out.println("Mời nhập giới tính");
        customer.setGioiTinh(sc.nextLine());
        System.out.println("Mời nhập số CMND");
        customer.setSoCmnd(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời nhập số điện thoại");
        customer.setSoDienThoai(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời nhập email");
        customer.setEmail(sc.nextLine());
        System.out.println("Mời nhập địa chỉ");
        customer.setDiaChi(sc.nextLine());
        System.out.println("Mời chọn loại khách");
        System.out.println("1.Diamond, 2.Platinium, 3.Gold, 4.Silver, 5.Member ");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                customer.setLoaiKhach("Diamond");
                break;
            case 2:
                customer.setLoaiKhach("Platinium");
                break;
            case 3:
                customer.setLoaiKhach("Gold");
                break;
            case 4:
                customer.setLoaiKhach("Silver");
                break;
            case 5:
                customer.setLoaiKhach("Member");
                break;
        }
        customers.add(customer);
        disPlay();
    }

    @Override
    public void edit(String hoTen) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getHoTen().equals(hoTen)) {
                System.out.println("Nhập họ tên ");
                customers.get(i).setHoTen(sc.nextLine());
                System.out.println("Nhập ngày sinh ");
                customers.get(i).setNgaySinh(sc.nextLine());
                System.out.println("Nhập giới tính ");
                customers.get(i).setGioiTinh(sc.nextLine());
                System.out.println("Nhập số CMND ");
                customers.get(i).setSoCmnd(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập số điện thoại ");
                customers.get(i).setSoDienThoai(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập số email ");
                customers.get(i).setEmail(sc.nextLine());
                System.out.println("Nhập địa chỉ ");
                customers.get(i).setDiaChi(sc.nextLine());
                System.out.println("Mời chọn loại khách hàng");
                System.out.println("1.Diamond, 2.Platinium, 3.Gold, 4.Silver, 5.Member");
                int choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        customers.get(i).setLoaiKhach("Diamond");
                        break;
                    case 2:
                        customers.get(i).setLoaiKhach("Platinium");
                        break;
                    case 3:
                        customers.get(i).setLoaiKhach("Gold");
                        break;
                    case 4:
                        customers.get(i).setLoaiKhach("Silver");
                        break;
                    case 5:
                        customers.get(i).setLoaiKhach("Member");
                        break;
                }
                break;

            }

        }
        disPlay();
    }
}
