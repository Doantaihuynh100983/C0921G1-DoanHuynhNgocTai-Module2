package thuat_toan_tim_kiem.bai_tap;

import java.util.Scanner;

public class TimKiemNhiPhanDeQuy {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can tim: ");
        int number = sc.nextInt();
        System.out.println(binarySearch(numbers, 0, numbers.length - 1, number));
    }

    public static int binarySearch(int[] arr, int left, int rigth, int value) {
        if (rigth >= left) {
            int mid = (left + rigth) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, left, mid - 1, value);
            }
            return binarySearch(arr, mid + 1, rigth, value);
        }
        return -1;
    }
}
