package FuramaResort.services;

import FuramaResort.models.Customer;


import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    static LinkedList<Customer> list = new LinkedList<>();

    static {
        Customer customer1 = new Customer("TÀI ĐOÀN 4", "10/09/2000", "Nam", 999999999, 777777777, "DoanTai@gmail.com", "Platinium", "nam phuoc");
        Customer customer2 = new Customer("TÀI ĐOÀN 5", "10/09/2000", "Nam", 999999999, 777777777, "DoanTai@gmail.com", "Platinium", "nam phuoc");
        Customer customer3 = new Customer("TÀI ĐOÀN 6", "10/09/2000", "Nam", 999999999, 777777777, "DoanTai@gmail.com", "Platinium", "nam phuoc");

        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
    }

    @Override
    public void disPlay() {
        int id = 1 ;
        for (Customer customer : list) {
            System.out.print("CTM" + id++ +"\t");
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
                customer.setLoaiKhach("1.Diamond");
                break;
            case 2:
                customer.setLoaiKhach("2.Platinium");
                break;
            case 3:
                customer.setLoaiKhach("3.Gold");
                break;
            case 4:
                customer.setLoaiKhach("4.Silver");
                break;
            case 5:
                customer.setLoaiKhach("5.Member");
                break;
        }


        list.add(customer);
        disPlay();
    }


    @Override
    public void edit(String hoTen) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHoTen().equals(hoTen)) {
                System.out.println("Nhập họ tên ");
                String hoTen1 = sc.nextLine();
                System.out.println("Nhập ngày sinh ");
                String ngaySinh = sc.nextLine();
                System.out.println("Nhập giới tính ");
                String gioiTinh = sc.nextLine();
                System.out.println("Nhập số CMND ");
                int soCmnd = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập số điện thoại ");
                int soDienThoai = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập số email ");
                String email = sc.nextLine();
                System.out.println("Nhập địa chỉ ");
                String diaChi = sc.nextLine();
                System.out.println("Nhập địa chỉ ");


                System.out.println("Mời chọn loại khách hàng");
                System.out.println("1.Diamond, 2.Platinium, 3.Gold, 4.Silver, 5.Member");
                int choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        list.get(i).setLoaiKhach("1.Diamond");
                        break;
                    case 2:
                        list.get(i).setLoaiKhach("2.Platinium");
                        break;
                    case 3:
                        list.get(i).setLoaiKhach("3.Gold");
                        break;
                    case 4:
                        list.get(i).setLoaiKhach("4.Silver");
                        break;
                    case 5:
                        list.get(i).setLoaiKhach("5.Member");
                        break;

                }



                list.get(i).setHoTen(hoTen1);
                list.get(i).setNgaySinh(ngaySinh);
                list.get(i).setGioiTinh(gioiTinh);
                list.get(i).setSoCmnd(soCmnd);
                list.get(i).setSoDienThoai(soDienThoai);
                list.get(i).setEmail(email);
                list.get(i).setDiaChi(diaChi);
                break;

            }


        }
        disPlay();


    }


}
