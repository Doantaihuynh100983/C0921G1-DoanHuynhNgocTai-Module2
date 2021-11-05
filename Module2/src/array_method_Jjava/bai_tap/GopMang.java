package array_method_Jjava.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size ;
        int [] arrayA;
        int [] arrayB;
        int [] arrayC;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử");
            size = sc.nextInt();
                if (size>20){
                    System.out.println("Bạn nhập sai rồi !!");
                }
        }while (size>20);

        arrayA = new int[100];
        arrayB = new int[100];
        System.out.println("Mảng A");
        for (int i = 0 ; i < size ; i++){

            System.out.println("Nhập phần tử thứ " +(i+1));
            arrayA[i] = sc.nextInt();
        }
        System.out.println("Mảng B");
        for (int i = 0 ; i < size ; i++){

            System.out.println("Nhập phần tử thứ " +(i+1));
            arrayB[i] = sc.nextInt();
        }



        System.out.println("Mảng A");
        for (int i = 0 ; i < size ; i++){
            System.out.print( arrayA[i] + "\t");

        }

        System.out.println();

        System.out.println("Mảng B");
        for (int i = 0 ; i < size ; i++){
            System.out.print( arrayB[i] + "\t");

        }


        // Gộp mảng
        System.out.println();
        arrayC = new int[100];
        int d = 0 ;

        for (int i = 0 ; i < size; i++){
            arrayC[d] = arrayA[i];
            d++ ;
        }
        for (int i = 0 ; i <size; i++){
            arrayC[d] = arrayB[i];
            d++ ;
        }
        System.out.println("Mảng C");
        for (int i = 0 ; i < 2*size ; i++){
            System.out.print( arrayC[i] + "\t");

        }

    }
}
