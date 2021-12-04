package FuramaResort.services.impl;


import FuramaResort.common.WriteReadFile;
import FuramaResort.models.Employee;
import FuramaResort.services.EmployeeService;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    public static final  String FILE_NAME = "Module2/src/FuramaResort/data/employee.csv";
     List<Employee> employees = new ArrayList<>();

     {
         employees =  covertStringToEmployee();

    }

    @Override
    public void disPlay() {
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
        newEmployee.setTrinhDo(setTrinhDo1());
        newEmployee.setViTri(setVitri1());

        employees.add(newEmployee);
        List<String> stringList = new ArrayList<>();
        stringList.add(newEmployee.toString());
        WriteReadFile.writeFile(FILE_NAME, stringList, true);
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
                employees.get(j).setTrinhDo(setTrinhDo1());
                employees.get(j).setViTri(setVitri1());
            }
        }
        List<String> stringList = covertEmployeeToString();
        WriteReadFile.writeFile(FILE_NAME, stringList, false);
    }


    Scanner scanner =  new Scanner(System.in);
    public String setVitri1(){

        String reSult = "";
        System.out.println("Mời chọn Vị trí");
        System.out.println("1.Lễ tân, 2.phục vụ, 3.chuyên viên, 4.giám sát, 5.quản lý, 6.giám đốc");
        int choice1 = scanner.nextInt();

        switch (choice1) {
            case 1:
                reSult = "Lễ/tân";
                break;
            case 2:
                reSult = "phục/vụ";
                break;
            case 3:
                reSult = "chuyên/viên";
                break;
            case 4:
                reSult = "giám/sát";
                break;
            case 5:
                reSult = "quản/lý";
                break;
            case 6:
                reSult = "giám/đốc";
                break;
        }
        return reSult;
    }

    public String setTrinhDo1(){
        String reSultTrinhDo = "";
        System.out.println("Mời chọn trình độ");
        System.out.println("1.Trung cấp - 2.Cao đẳng - 3.Đại học - 4.sau đại học");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                reSultTrinhDo = "Trung/cấp";
                break;
            case 2:
                reSultTrinhDo = "Cao/đẳng";
                break;
            case 3:
                reSultTrinhDo = "Đại/học";
                break;
            case 4:
                reSultTrinhDo = "sau/đại/học";
                break;

        }
        return reSultTrinhDo;
    }



    public List<Employee> covertStringToEmployee() {
        List<String> stringList = WriteReadFile.readFile(FILE_NAME);
        List<Employee> employeeList = new ArrayList<>();
        String[] arrEmployee;
        for (String line : stringList) {
            arrEmployee = line.split(",");
            employeeList.add(new Employee(arrEmployee[0], arrEmployee[1], arrEmployee[2],
                  arrEmployee[3], Integer.parseInt(arrEmployee[4]), Integer.parseInt(arrEmployee[5]), arrEmployee[6], arrEmployee[7],
                    arrEmployee[8], Double.parseDouble(arrEmployee[9])));
        }
        return employeeList;
    }

    public List<String> covertEmployeeToString() {
        List<String> listString = new ArrayList<>();
        for (Employee employee : employees) {
            listString.add(employee.toString());
        }
        return listString;
    }
}
