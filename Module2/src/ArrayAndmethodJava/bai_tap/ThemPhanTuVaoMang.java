package ArrayAndmethodJava.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size ;
        int[] array ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời nhập kích thước mảng :");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Bạn Nhập sai rồi !!");
            }
        }while (size > 20);

        array = new int[1000];
        for (int i = 0 ; i < size ; i++){
            System.out.println("Mời nhập phần tử thứ " + (i+1));
            array[i] = sc.nextInt();
        }
        for (int i = 0 ; i < size ; i++){
            System.out.print(array[i] + " - ");

        }
        System.out.println();
        //thêm phần tử vào mảng
        System.out.println("Nhập phần tử cần thêm");
        int X = sc.nextInt();  // giá trị chuẩn bị thêm
        System.out.println("Nhập vị trí cần thêm");
        int index = sc.nextInt(); // vị trí cần thêm
        size++; // tang size của mảng

        for (int i = size - 1 ; i > index ; i--){
            array[i] = array[i-1] ;
        }
        array[index] = X;

        for (int i = 0 ; i < size ; i++){
            System.out.println(array[i]);
        }
    }
}
