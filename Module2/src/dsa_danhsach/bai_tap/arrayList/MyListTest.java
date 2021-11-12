package dsa_danhsach.bai_tap.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("tài");
        list.add("đoàn");
        list.add("tiến");
        list.add("huyền");

        print(list.getData());
        System.out.println(list.indexOf("tiến"));
        System.out.println(list.indexOf("huyền"));
        list.remove(1);
        list.add("rất",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("tài"));
        System.out.println(clone.contains("huyền"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }



}
