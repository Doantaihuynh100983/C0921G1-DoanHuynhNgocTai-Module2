package FuramaResort.services.impl;


import FuramaResort.common.WriteReadFile;
import FuramaResort.models.Customer;
import FuramaResort.models.Employee;
import FuramaResort.services.CustomerService;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    List<Customer> customers = new LinkedList<>();
    public static final String FILE_NAME = "Module2/src/FuramaResort/data/customer.csv";
    {
        customers = covertStringToEmployee();
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void disPlay() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        List<String> stringList = new ArrayList<>();
        Customer customer = new Customer();
        System.out.println("Mời nhập mã số");
        customer.setMaSo(sc.nextLine());
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
        customer.setLoaiKhach(loaiKhach1());
        customers.add(customer);
        stringList.add(customer.toString());
        WriteReadFile.writeFile(FILE_NAME, stringList, true);
    }

    @Override
    public void edit(String hoTen) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getHoTen().equals(hoTen)) {
                System.out.println("Mời nhập mã số");
                customers.get(i).setMaSo(sc.nextLine());
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
                customers.get(i).setLoaiKhach(loaiKhach1());

                List<String> stringList = covertEmployeeToString();
                WriteReadFile.writeFile(FILE_NAME, stringList, false);
            }

        }
    }


    public String loaiKhach1() {
        String reSult = "";
        System.out.println("Mời chọn loại khách hàng");
        System.out.println("1.Diamond, 2.Platinium, 3.Gold, 4.Silver, 5.Member");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                reSult = "Diamond";
                break;
            case 2:
                reSult = "Platinium";
                break;
            case 3:
                reSult = "Gold";
                break;
            case 4:
                reSult = "Silver";
                break;
            case 5:
                reSult = "Member";
                break;
        }
        return reSult;
    }


    public String maKhachHang() {
        int chocie = sc.nextInt();
        return customers.get(chocie - 1).getMaSo();
    }


    public List<Customer> covertStringToEmployee() {
        List<String> stringList = WriteReadFile.readFile(FILE_NAME);
        List<Customer> customers1 = new LinkedList<>();
        String[] arrCustomer;
        for (String line : stringList) {
            arrCustomer = line.split(",");
            customers1.add(new Customer(arrCustomer[0], arrCustomer[1], arrCustomer[2],
                    arrCustomer[3], Integer.parseInt(arrCustomer[4]), Integer.parseInt(arrCustomer[5]), arrCustomer[6], arrCustomer[7],
                    arrCustomer[8]));
        }
        return customers1;
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new LinkedList<>();
        for (Customer customer : customers) {
            listString.add(customer.toString());
        }
        return listString;
    }

}
