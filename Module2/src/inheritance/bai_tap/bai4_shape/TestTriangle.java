package inheritance.bai_tap.bai4_shape;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh 1 : ");
        double c1  =Double.parseDouble(sc.nextLine()) ;
        System.out.println("Nhập cạnh 2 : ");
        double c2  =Double.parseDouble(sc.nextLine()) ;
        System.out.println("Nhập cạnh 2 : ");
        double c3  =Double.parseDouble(sc.nextLine()) ;
        System.out.println("Nhập màu sắc : ");
        String color  =sc.nextLine() ;
        Triangle triangle = new Triangle(c1,c2,c3,color);
        System.out.println("Thông tin của tam giác :"+triangle.toString());
    }
}
