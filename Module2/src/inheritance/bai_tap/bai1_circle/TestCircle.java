package inheritance.bai_tap.bai1_circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập bán kính :");
        double banKinh = Double.parseDouble(sc.nextLine());
        System.out.println("Mời nhập màu sắc :");
        String mauSac = sc.nextLine();
        Circle circle = new Circle(banKinh , mauSac);
        System.out.println("Radius :"+circle.getRadius());
        System.out.println("Color"+ circle.getColor());

        Circle circle1 = new Circle(banKinh,mauSac);
        System.out.println( circle1.toString());
    }
}
