package array_method_Jjava.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int m ;
        int n ;

        // nhập mảng
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập i");
            m = sc.nextInt();
            System.out.println("Nhập j");
            n = sc.nextInt();
            if (m > 10){
                System.out.println("Bạn nhập sai rồi !!!");
            }
        }while (m > 10);

          int  array[][] = new int[m][n];

                // nhập phần tử thứ i j
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.println("Mời nhập A [" + i + "]" + "[" + j +"]");
                array[i][j] = sc.nextInt();
            }

        }

        // xuất mảng
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print(array[i][j] + "\t") ;
            }
            System.out.println("\n");
        }

            int max = array[0][0];
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array[i].length ; j++){
                    if (max < array[i][j]){
                        max = array[i][j];
                    }
            }

        }
        System.out.println("Phần tử lớn nhất trong ma trận là  =" + max);
    }
}
