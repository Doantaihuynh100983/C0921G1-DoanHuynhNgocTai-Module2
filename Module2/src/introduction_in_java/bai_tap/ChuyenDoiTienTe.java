package introduction_in_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền cần đổi");

        int USD = sc.nextInt();
        int rate = USD * 23000 ;
        System.out.println("Số tiền bạn đổi được là = " + rate);
    }
}
