package FuramaResort.services.impl;


import FuramaResort.common.ReadWriteFile;
import FuramaResort.models.Customer;
import FuramaResort.models.Employee;
import FuramaResort.services.EmployeeService;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    public static final String FILE_NAME = "Module2/src/FuramaResort/data/employee.dat";
    ReadWriteFile readWriteFile = new ReadWriteFile();
    List<Employee> employees = readWriteFile.readDataFromFile(FILE_NAME);
//
//    static List<Employee> employees = new ArrayList<>();

//    static {
//        employees.add(new Employee("EPM001", "Tài đoàn 1", "30/10/2000", "nam",
//                123456789, 985666666, "taidoan@gmail.com", "cao dang", "giam doc", 200.0000));
//        employees.add( new Employee("EPM002", "Tài đoàn 2", "30/10/2000", "nam",
//                123456789, 985666666, "taidoan@gmail.com", "cao dang", "giam doc", 200.0000));
//        employees.add(new Employee("EPM003", "Tài đoàn 3", "30/10/2000", "nam",
//                123456789, 985666666, "taidoan@gmail.com", "cao dang", "giam doc", 200.0000));
//    }

    @Override
    public void disPlay() {
        List<Employee> employees = readWriteFile.readDataFromFile(FILE_NAME);
        for (Employee employee : employees){
            System.out.println(employee);
        }

    }

    @Override
    public void add() {
        Employee newEmployee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số nhân viên");
        newEmployee.setMaSo(sc.nextLine());
        System.out.println("Nhập họ và tên");
        newEmployee.setHoTen(sc.nextLine());
        System.out.println("Nhập ngày sinh");
        newEmployee.setNgaySinh(sc.nextLine());
        System.out.println("Nhập giới tính");
        newEmployee.setGioiTinh(sc.nextLine());
        System.out.println("Nhập chứng minh nhân dân ");
        newEmployee.setSoCmnd(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập số điện thoại ");
        newEmployee.setSoDienThoai(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập email");
        newEmployee.setEmail(sc.nextLine());
        System.out.println("Nhập luong");
        newEmployee.setLuong(Double.parseDouble(sc.nextLine()));
        System.out.println("Mời chọn trình độ");
        System.out.println("1.Trung cấp - 2.Cao đẳng - 3.Đại học - 4.sau đại học");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                newEmployee.setTrinhDo("Trung cấp");
                break;
            case 2:
                newEmployee.setTrinhDo("Cao đẳng");
                break;
            case 3:
                newEmployee.setTrinhDo("Đại học");
                break;
            case 4:
                newEmployee.setTrinhDo("sau đại học");
                break;

        }
        System.out.println("Mời chọn Vị trí");
        System.out.println("1.Lễ tân, 2.phục vụ, 3.chuyên viên, 4.giám sát, 5.quản lý, 6.giám đốc");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                newEmployee.setViTri("1.Lễ tân");
                break;
            case 2:
                newEmployee.setViTri("2.phục vụ");
                break;
            case 3:
                newEmployee.setViTri("3.chuyên viên");
                break;
            case 4:
                newEmployee.setViTri("4.giám sát");
                break;
            case 5:
                newEmployee.setViTri("5.quản lý");
                break;
            case 6:
                newEmployee.setViTri("6.giám đốc");
                break;
        }

        employees.add(newEmployee);
        readWriteFile.writeToFile(FILE_NAME,employees);
        disPlay();


    }

    @Override
    public void edit(String hoTen) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < employees.size(); j++) {
            if (employees.get(j).getHoTen().equals(hoTen)) {
                System.out.println("Nhập mã số nhân viên");
                employees.get(j).setMaSo(sc.nextLine());
                System.out.println("Nhập họ tên ");
                employees.get(j).setHoTen(sc.nextLine());
                System.out.println("Nhập ngày sinh ");
                employees.get(j).setNgaySinh(sc.nextLine());
                System.out.println("Nhập giới tính ");
                employees.get(j).setGioiTinh(sc.nextLine());
                System.out.println("Nhập số CMND ");
                employees.get(j).setSoCmnd(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập số điẹn thoại ");
                employees.get(j).setSoDienThoai(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập email ");
                employees.get(j).setEmail(sc.nextLine());
                System.out.println("Nhập lương");
                employees.get(j).setLuong(Double.parseDouble(sc.nextLine()));
                System.out.println("Mời chọn trình độ");
                System.out.println("1.Trung cấp - 2.Cao đẳng - 3.Đại học - 4.sau đại học");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        employees.get(j).setTrinhDo("Trung cấp");
                        break;
                    case 2:
                        employees.get(j).setTrinhDo("Cao đẳng");
                        break;
                    case 3:
                        employees.get(j).setTrinhDo("Đại học");
                        break;
                    case 4:
                        employees.get(j).setTrinhDo("sau đại học");
                        break;

                }
                System.out.println("Mời chọn Vị trí");
                System.out.println("1.Lễ tân, 2.phục vụ, 3.chuyên viên, 4.giám sát, 5.quản lý, 6.giám đốc");
                int choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        employees.get(j).setViTri("1.Lễ tân");
                        break;
                    case 2:
                        employees.get(j).setViTri("2.phục vụ");
                        break;
                    case 3:
                        employees.get(j).setViTri("3.chuyên viên");
                        break;
                    case 4:
                        employees.get(j).setViTri("4.giám sát");
                        break;
                    case 5:
                        employees.get(j).setViTri("5.quản lý");
                        break;
                    case 6:
                        employees.get(j).setViTri("6.giám đốc");
                        break;
                }
                break;
            }
        }
        readWriteFile.writeToFile(FILE_NAME,employees);
        disPlay();


    }
}
