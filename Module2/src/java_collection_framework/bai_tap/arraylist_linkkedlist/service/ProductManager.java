package java_collection_framework.bai_tap.arraylist_linkkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager implements ProductManagerImpl {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product("C00009", "Bánh Quy", 50.000));
        products.add(new Product("C00009", "Bánh Quy", 50.000));
        products.add(new Product("C00019", "Kẹo Ngọt", 49.000));
        products.add(new Product("C00020", "Bánh Chuối", 55.000));

    }

    @Override
    public void add() {
        Product product1 = new Product();
        System.out.println("nhập mã sản phẩm");
        product1.setMaSanPham(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        product1.setTenSanPham(scanner.nextLine());
        System.out.println("nhập giá tiền của sản phẩm");
        product1.setGiaTien(Double.parseDouble(scanner.nextLine()));

        products.add(product1);
        disPlay();
    }

    @Override
    public void edit(String maSanPham) {
            for (int i = 0 ; i < products.size() ; i++){
                if (maSanPham.equals(products.get(i).getMaSanPham())){
                    System.out.println("nhập mã sản phẩm");
                    products.get(i).setMaSanPham(scanner.nextLine());
                    System.out.println("nhập tên sản phẩm");
                    products.get(i).setTenSanPham(scanner.nextLine());
                    System.out.println("nhập giá tiền của sản phẩm");
                    products.get(i).setGiaTien(Double.parseDouble(scanner.nextLine()));
                    break;
                }
            }
        disPlay();
    }

    @Override
    public void delete(String maSanPham) {
        for (int i = 0 ; i < products.size() ; i++){
            if (maSanPham.equals(products.get(i).getMaSanPham())){
               products.remove(products.get(i));
            }
        }
        disPlay();

    }

    @Override
    public void disPlay() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void search(String tenSanPham) {
        for (int i = 0 ; i < products.size() ; i++){
            if (tenSanPham.contains(products.get(i).getTenSanPham())){
                System.out.println(products.get(i));
            }
        }

    }

    @Override
    public void sort_up_ascending() {
        Sort_up_ascending scSort_up_ascending = new Sort_up_ascending();
        Collections.sort(products,scSort_up_ascending);
        for(Product st : products){
            System.out.println(st);
        }
    }

    @Override
    public void sort_descending() {
        Sort_Descending scSort_descending = new Sort_Descending();
        Collections.sort(products,scSort_descending);
        for (Product product : products){
            System.out.println(product);
        }
    }
}
