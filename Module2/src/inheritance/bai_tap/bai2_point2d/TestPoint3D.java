package inheritance.bai_tap.bai2_point2d;

import java.util.Arrays;
import java.util.Scanner;

public class TestPoint3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập x ");
        float x =Float.parseFloat(sc.nextLine()) ;
        System.out.println("mời nhập y ");
        float y =Float.parseFloat(sc.nextLine()) ;
        System.out.println("mời nhập z ");
        float z =Float.parseFloat(sc.nextLine()) ;

        Point3D pd3 = new Point3D(x,y,z);
        pd3.getX();
        pd3.getY();
        pd3.getZ();
        System.out.println(pd3.toString());
        System.out.println( "MẢNG XYZ  = "+Arrays.toString(pd3.getXYZ()));
    }
}
