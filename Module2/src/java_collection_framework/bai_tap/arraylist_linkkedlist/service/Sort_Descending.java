package java_collection_framework.bai_tap.arraylist_linkkedlist.service;

import java_collection_framework.bai_tap.arraylist_linkkedlist.modles.Product;

import java.util.Comparator;

public class Sort_Descending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getGiaTien() > o2.getGiaTien()){
            return -1;
        }else if(o1.getGiaTien() == o2.getGiaTien()){
            return 0;
        }else{
            return 1;
        }
    }
}
