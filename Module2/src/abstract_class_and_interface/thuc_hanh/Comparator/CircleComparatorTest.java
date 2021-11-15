package abstract_class_and_interface.thuc_hanh.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {

    public static void main(String[] args) {
        Cicle[] circles = new Cicle[3];
        circles[0] = new Cicle(3.6);
        circles[1] = new Cicle();
        circles[2] = new Cicle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Cicle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Cicle circle : circles) {
            System.out.println(circle);
        }
    }

}
