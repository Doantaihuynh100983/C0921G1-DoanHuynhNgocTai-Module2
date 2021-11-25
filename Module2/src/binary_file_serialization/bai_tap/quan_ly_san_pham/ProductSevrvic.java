package binary_file_serialization.bai_tap.quan_ly_san_pham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSevrvic  implements Productimpl {
    public static final String FILE_NAME = "Module2/src/binary_file_serialization/bai_tap/quan_ly_san_pham/Product.dat" ;

    DocGhiFIle docGhiFIle = new DocGhiFIle();
    List<Product> products = docGhiFIle.readDataFromFile(FILE_NAME);

    Scanner sc  = new Scanner(System.in);
    @Override
    public void add() {
        Product product1 = new Product();
        System.out.println("nhập mã sản phẩm");
           product1.setMaSanPham(sc.nextLine());
        System.out.println("nhập tên sản phẩm");
        product1.setTenSanPham(sc.nextLine());
        System.out.println("nhập hãng sản phẩm");
        product1.setHangSanPham(sc.nextLine());
        System.out.println("nhập giá");
        product1.setGia(sc.nextLine());

        products.add(product1);
        docGhiFIle.writeToFile(FILE_NAME,products );
        disPlay();
    }

    @Override
    public void disPlay() {
        List<Product> products = docGhiFIle.readDataFromFile(FILE_NAME);
        for (Product product : products){
            System.out.println(product);
        }
    }

    @Override
    public void search(String maSanPham) {
        for (int i = 0 ; i < products.size() ; i++){
            if (products.get(i).getMaSanPham().equals(maSanPham)){
                System.out.println("nhập mã sản phẩm");
                products.get(i).setMaSanPham(sc.nextLine());
            }
        }
        docGhiFIle.writeToFile("Module2/src/binary_file_serialization/bai_tap/quan_ly_san_pham/Product.dat" ,products );
    }



}
