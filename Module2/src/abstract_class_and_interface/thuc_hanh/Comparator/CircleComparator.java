package abstract_class_and_interface.thuc_hanh.Comparator;

import java.util.Comparator;

public class CircleComparator implements Comparator<Cicle> {
    public int compare(Cicle c1, Cicle c2){
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
