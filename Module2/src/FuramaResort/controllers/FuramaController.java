package FuramaResort.controllers;

import FuramaResort.services.CustomerService;
import FuramaResort.services.EmployeeService;
import FuramaResort.services.impl.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController {
    public void menu() {

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
        CustomerService customerServiceImpl = new CustomerServiceImpl();


        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContactServiceImpl contactService = new ContactServiceImpl();
        PromotionServiceImpl promotionService = new PromotionServiceImpl();
        while (choice != 6) {
            while (true) {
                try {
                    System.out.println("1. Employee Management");
                    System.out.println("2. Customer Management");
                    System.out.println("3. Facility Management");
                    System.out.println("4. Booking Management");
                    System.out.println("5. Promotion Management");
                    System.out.println("6. Exit");
                    System.out.println("Nhập từ 1 đến 6 để chọn chức năng");
                    choice = Integer.parseInt(sc.nextLine());

                    switch (choice) {
                        case 1:
                            int choice1 = 0;
                            while (choice1 != 4) {
                                try {
                                    System.out.println("1 Display list employees");
                                    System.out.println("2 Add new employee");
                                    System.out.println("3 Edit employee");
                                    System.out.println("4 Return main menu");
                                    System.out.println("Nhập từ 1 đến 4 để thứ");
                                    choice1 = Integer.parseInt(sc.nextLine());

                                    switch (choice1) {
                                        case 1:
                                            System.out.print(" ============================================ \n");
                                            employeeServiceImpl.disPlay();
                                            System.out.print("============================================ \n");
                                            break;
                                        case 2:
                                            System.out.print("============================================\n");
                                            employeeServiceImpl.add();
                                            System.out.print("============================================\n");
                                            break;
                                        case 3:
                                            System.out.print("============================================\n");
                                            Scanner sc1 = new Scanner(System.in);
                                            System.out.println("Mời nhập vào tên chỉnh sữa");
                                            String index = sc1.nextLine();
                                            employeeServiceImpl.edit(index);
                                            System.out.print("============================================\n");
                                            break;
                                        case 4:

                                            break;
                                        default:
                                            System.err.println("Bạn nhập vào số từ 1 - 4 nha !!!");
                                            break;
                                    }

                                } catch (NumberFormatException n) {
                                    System.err.println("SAO BẠN LẠI NhẬP CHỮ VÀO !!!");
                                }

                            }
                            break;


                        case 2:
                            int choice2 = 0;
                            while (choice2 != 4) {
                                try {


                                    System.out.println("1. Display list customers");
                                    System.out.println("2. Add new customer");
                                    System.out.println("3. Edit customer");
                                    System.out.println("4. Return main menu");
                                    System.out.println("Nhập từ 1 đến 4 để thứ");
                                    choice2 = Integer.parseInt(sc.nextLine());

                                    switch (choice2) {
                                        case 1:
                                            System.out.print("============================================\n");
                                            customerServiceImpl.disPlay();
                                            System.out.print("============================================\n");
                                            break;
                                        case 2:
                                            System.out.print("============================================\n");
                                            customerServiceImpl.add();
                                            System.out.print("============================================\n");
                                            break;
                                        case 3:
                                            System.out.print("============================================\n");
                                            Scanner sc1 = new Scanner(System.in);
                                            System.out.println("Mời nhập vào tên cần chỉnh sữa");
                                            String index = sc1.nextLine();
                                            customerServiceImpl.edit(index);
                                            System.out.print("============================================\n");
                                            break;
                                        case 4:
                                            break;
                                        default:
                                            System.err.println("Bạn nhập vào số từ 1 - 4 nha !!!");
                                            break;
                                    }
                                } catch (NumberFormatException numberFormatException) {
                                    System.err.println("KHôNG ĐƯỢC NHẬP CHỮ NHA !!!");
                                }
                            }
                            break;

                        case 3:
                            int choice3 = 0;
                            while (choice3 != 4) {
                                try {
                                    System.out.println("1 Display list facility");
                                    System.out.println("2 Add new facility");
                                    System.out.println("3 Display list facility maintenance");
                                    System.out.println("4 Return main menu");
                                    choice3 = Integer.parseInt(sc.nextLine());

                                    switch (choice3) {
                                        case 1:
                                            System.out.print("============================================\n");
                                            facilityService.disPlay();
                                            System.out.print("============================================\n");
                                            break;
                                        case 2:
                                            int choice5 = 0;
                                            while (choice5 != 4) {
                                                try {
                                                    System.out.println("1. Add New Villa");
                                                    System.out.println("2. Add New Room");
                                                    System.out.println("3. Add New House");
                                                    System.out.println("4. Return main menu");
                                                    choice5 = sc.nextInt();

                                                    switch (choice5) {
                                                        case 1:
                                                            System.out.print("============================================\n");
                                                            facilityService.addVilla();
                                                            System.out.print("============================================\n");
                                                            break;
                                                        case 2:
                                                            System.out.print("============================================\n");
                                                            facilityService.addRoom();
                                                            System.out.print("============================================\n");
                                                            break;
                                                        case 3:
                                                            System.out.print("============================================\n");
                                                            facilityService.addHouse();
                                                            System.out.print("============================================\n");
                                                            break;
                                                        case 4:
                                                            break;
                                                        default:
                                                            System.err.println("Bạn nhập vào số từ 1 - 4 nha !!!");
                                                            break;

                                                    }
                                                } catch (NumberFormatException n) {
                                                    System.err.println("Bạn Không Được Nhập Chữ");
                                                }
                                            }

                                            break;
                                        case 3:
                                            System.out.print("============================================\n");
                                            System.out.println(" Display list facility maintenance");
                                            facilityService.disPlayFacilityMainTenance();
                                            System.out.print("============================================\n");
                                            break;
                                        case 4:
                                            break;
                                        default:
                                            System.err.println("Bạn nhập vào số từ 1 - 4 nha !!!");
                                            break;
                                    }
                                } catch (NumberFormatException numberFormatException) {
                                    System.err.println("Bạn nhập sai rồi ");
                                }
                            }
                            break;
                        case 4:
                            int choice4 = 0;
                            while (choice4 != 6) {
                                try {


                                    System.out.println("1. Add new booking");
                                    System.out.println("2. Display list booking");
                                    System.out.println("3. Create new constracts");
                                    System.out.println("4. Display list contracts");
                                    System.out.println("5. Edit contracts");
                                    System.out.println("6. Return main menu");
                                    choice4 = Integer.parseInt(sc.nextLine());

                                    switch (choice4) {
                                        case 1:
                                            System.out.print("============================================\n");
                                            bookingService.add();
                                            System.out.print("============================================\n");
                                            break;
                                        case 2:
                                            System.out.print("============================================\n");
                                            bookingService.disPlay();
                                            System.out.print("============================================\n");
                                            break;
                                        case 3:
                                            System.out.print("============================================\n");
                                            contactService.add();
                                            System.out.print("============================================\n");
                                            break;
                                        case 4:
                                            System.out.print("============================================\n");
                                            contactService.disPlay();
                                            System.out.print("============================================\n");
                                            break;
                                        case 5:
                                            System.out.print("============================================\n");
                                            System.out.println("mời nhập mã bookIng cần sữa");
                                            Scanner scanner9 = new Scanner(System.in);
                                            String maBooking = scanner9.nextLine();
                                            contactService.edit(maBooking);
                                            System.out.print("============================================\n");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.err.println("Bạn nhập vào số từ 1 - 6 nha !!!");
                                            break;
                                    }
                                }catch (NumberFormatException numberFormatException){
                                    System.err.println("Bạn không được nhập chữ");
                                }
                            }
                            break;
                        case 5:
                            int choice5 = 0 ;
                            while (choice5 != 3) {
                                try {


                                    System.out.println("1. Display list customers use service");
                                    System.out.println("2. Display list customers get voucher");
                                    System.out.println("3. Return main menu");

                                    choice5 = Integer.parseInt(sc.nextLine());

                                    switch (choice5) {
                                        case 1:
                                            System.out.print("============================================\n");
                                            Scanner scanner = new Scanner(System.in);
                                            bookingService.disPlay();
                                            System.out.println("Mời nhập năm cần tìm kiếm");
                                            String nam = scanner.nextLine();
                                            promotionService.danhSachKhachHang(nam);
                                            System.out.print("============================================\n");
                                            break;
                                        case 2:
                                            System.out.print("============================================\n");
                                            promotionService.voucherKhuyenMai();
//                                            bookingService.ngayThang();
                                            System.out.print("============================================\n");
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            System.err.println("Bạn nhập vào số từ 1 - 4 nha !!!");
                                            break;
                                    }
                                }catch (NumberFormatException n){
                                    System.err.println("Bạn không được nhập chữ !!!");
                                }
                            }
                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            System.err.println("Bạn nhập vào số từ 1 - 6 nha !!!");
                            break;
                    }
                } catch (NumberFormatException numberFormatException) {
                    System.err.println("Bạn nhập vào số từ 1 - 6 nha !!!");
                }

            }


        }
    }
}
