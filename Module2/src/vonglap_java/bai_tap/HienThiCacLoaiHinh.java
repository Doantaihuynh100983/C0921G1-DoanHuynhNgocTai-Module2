package vonglap_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");


            do {
                System.out.println("Nhập từ 1 đến 4 để chọn chức năng");
                choice = sc.nextInt();
            } while ((choice < 1) || (choice > 5));


            switch (choice) {
                case 1:
                    System.out.println("nhập chiều rộng");
                    int a = sc.nextInt();
                    System.out.println("nhập chiều dài");
                    int b = sc.nextInt();
                    for (int i = 0; i <= a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }


                    break;
                case 2:
                    System.out.println("Nhập chiều cao h vào đi!!");
                    int h = sc.nextInt();
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều cao h vào đi !!");
                    h = sc.nextInt();
                    for (int i = 0; i < h; i++) {
                        for (int j = i; j < h - 1; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                    System.exit(0);
                    break;
            }
        }
    }

}
