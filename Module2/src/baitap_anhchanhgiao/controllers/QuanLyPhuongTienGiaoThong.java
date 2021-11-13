package baitap_anhchanhgiao.controllers;


import baitap_anhchanhgiao.models.PhuongTien;
import baitap_anhchanhgiao.service.OtoSerViceImpl;
import baitap_anhchanhgiao.service.XeMaySerViceImpl;
import baitap_anhchanhgiao.service.XeTaiSerViceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyPhuongTienGiaoThong {
    public void menu() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        OtoSerViceImpl otoSerViceImpl = new OtoSerViceImpl();
        XeMaySerViceImpl xeMaySerViceImpl = new XeMaySerViceImpl();
        XeTaiSerViceImpl xeTaiSerViceImpl = new XeTaiSerViceImpl();


        while (choice != 5) {

            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm Kiếm");
            System.out.println("5. Thoát");

            System.out.println("Nhập từ 1 đến 4 để chọn chức năng");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 4) {
                        System.out.println("1 Thêm Mới Xe Tải");
                        System.out.println("2 Thêm Mới Oto");
                        System.out.println("3 Thêm Mới Xe Máy");
                        System.out.println("4 Return main menu");
                        System.out.println("Nhập từ 1 đến 4 để thứ");

                        choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.print(" ============================================ \n");
                                xeTaiSerViceImpl.add();
                                System.out.print("============================================ \n");
                                break;
                            case 2:
                                System.out.print("============================================\n");
                                otoSerViceImpl.add();
                                System.out.print("============================================\n");
                                break;
                            case 3:
                                System.out.print("============================================\n");
                                xeMaySerViceImpl.add();
                                System.out.print("============================================\n");
                                break;
                            case 4:

                                break;
                        }
                    }
                    break;
                case 2:
                    int choice2 = 0;
                    while (choice2 != 4) {
                        System.out.println("1 Hiển thị xe tải");
                        System.out.println("2 Hiện thị xe ô tô");
                        System.out.println("3 Hiển thị xe máy");
                        System.out.println("4 Return main menu");
                        System.out.println("Nhập từ 1 đến 4 để thứ");

                        choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.print(" ============================================ \n");
                                xeTaiSerViceImpl.disPlay();
                                System.out.print("============================================ \n");
                                break;
                            case 2:
                                System.out.print("============================================\n");
                                otoSerViceImpl.disPlay();
                                System.out.print("============================================\n");
                                break;
                            case 3:
                                System.out.print("============================================\n");
                                xeMaySerViceImpl.disPlay();
                                System.out.print("============================================\n");
                                break;
                            case 4:

                                break;
                        }
                    }
                    break;
                case 3:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập biển kiểm soát :");
                    String bienKiemSoat = scanner.nextLine();
                    if (otoSerViceImpl.check(bienKiemSoat) || xeMaySerViceImpl.check(bienKiemSoat)
                            || xeTaiSerViceImpl.check(bienKiemSoat)) {
                        System.out.println("1.Yes\n2.No");
                        int choice22 = Integer.parseInt(scanner.nextLine());
                        if (choice22 == 1) {
                            otoSerViceImpl.delete(bienKiemSoat);
                            xeMaySerViceImpl.delete(bienKiemSoat);
                            xeTaiSerViceImpl.delete(bienKiemSoat);
                            System.out.println("Xóa thành công\n Ấn enter để quay lại menu ");
                            String choice3=scanner.nextLine();
                            if(choice3.equals("")){
                                break;
                            }
                        }

                    }
                    break;

                case 4 :
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhập tên chủ sỡ hữu");
                    String chuSoHuu = scanner1.nextLine();
                    if (xeTaiSerViceImpl.checkSearch(chuSoHuu) || xeMaySerViceImpl.checkSearch(chuSoHuu)
                    ||otoSerViceImpl.checkSearch(chuSoHuu)){
                        xeTaiSerViceImpl.search(chuSoHuu);
                        xeMaySerViceImpl.search(chuSoHuu);
                        otoSerViceImpl.search(chuSoHuu);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
