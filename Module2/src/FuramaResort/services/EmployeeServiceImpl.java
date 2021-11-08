package FuramaResort.services;


import FuramaResort.models.Employee;

import java.util.ArrayList;
public class EmployeeServiceImpl extends Employee implements Service {


    public EmployeeServiceImpl() {
        super();
    }

    public EmployeeServiceImpl(String id, String hoTen, String ngaySinh, String gioiTinh, int soCmnd, int soDienThoai,
                               String email, String trinhDo, String viTri, double luong) {
        super(id, hoTen, ngaySinh, gioiTinh, soCmnd, soDienThoai, email, trinhDo, viTri, luong);

    }

    ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void disPlay() {
        Employee employee1 = new Employee("123", "Tài đoàn","30/10/2000" , "nam",123456789 , 985666666 , "taidoan@gmail.com" , "cao dang" , "giam doc" , 200.0000);
        Employee employee2 = new Employee("123", "Tài đoàn","30/10/2000" , "nam",123456789 , 985666666 , "taidoan@gmail.com" , "cao dang" , "giam doc" , 200.0000);
        Employee employee3 = new Employee("123", "Tài đoàn","30/10/2000" , "nam",123456789 , 985666666 , "taidoan@gmail.com" , "cao dang" , "giam doc" , 200.0000);


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        hienThi();
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    public void hienThi(){
        for (Employee employee: employees) {
            System.out.println(employee);

        }
    }
}
