package array_method_Jjava.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {

        // nhập kích thước mảng 1 chiều
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời nhập số lượng phần tử cần dùng");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Bạn Đã Nhập Sai Rồi !!!");
            }
        } while (size > 20);

        // nhập phần tử thứ i trong mảng 1 chiều
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Mời nhập phần tử thứ" + (i + 1));
            array[i] = sc.nextInt();
        }
        // xuất mảng 1 chiều
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println();
        // xóa phần tử trong mảng và đẩy phần tử cuối lên bằng 0
        System.out.println("Nhập phần tử cần xóa");
        int n = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }

                array[array.length - 1] = 0;

            }
            System.out.println("Mảng sau khi xóa là = " + array[i]);

        }
    }
}
