package class_and_obiject_in_java.bai_tap.quadraticEquation;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double a , b ,c ;
        System.out.println("Mời nhập vào a,b ,c ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập a :");
        a = sc.nextInt();
        System.out.println("Mời nhập b :");
        b = sc.nextInt();
        System.out.println("Mời nhập c :");
        c= sc.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a ,b ,c );
        quadraticEquation.giaiPhuongTrinh();
    }
}
