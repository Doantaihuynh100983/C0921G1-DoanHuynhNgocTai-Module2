package array_method_Jjava.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
            int size ;
            int [] array ;
        Scanner sc = new Scanner(System.in);
            do {
                System.out.println("nhập kích thước mảng");
                size = sc.nextInt();
                if (size > 20){
                    System.out.println("Bạn Nhập Sai Rồi !!");
                }
            }while (size>20);

            array = new int[1000];
            for (int i = 0 ; i < size ; i++){
                System.out.println("nhập phần tử thứ i" + (i+1));
                array[i] = sc.nextInt();
            }
        for (int i = 0 ; i < size ; i++){
            System.out.print(array[i] + "\t");

        }
        System.out.println();
        int min = array[0];
        for (int i = 0 ; i < size ; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là : " + min);

    }
}
