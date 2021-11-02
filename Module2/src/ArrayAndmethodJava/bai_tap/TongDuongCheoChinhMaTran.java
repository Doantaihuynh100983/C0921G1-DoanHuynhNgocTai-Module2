package ArrayAndmethodJava.bai_tap;

import java.util.Scanner;

public class TongDuongCheoChinhMaTran {
    public static void main(String[] args) {
        int m;
        int n;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập i");
            m = sc.nextInt();
            System.out.println("Nhập j");
            n = sc.nextInt();
            if (m > 10 || n > 10) {
                System.out.println("bạn nhập sai rồi !!");
            }
        } while (m > 10 || n > 10);
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma Trận [i][j]");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println("\n");
        }


          int  sum = 0 ;
        for (int i = 0 ; i < m ; i++){
            sum += array[i][i];

        }
        System.out.println("Tổng đường chéo chính trong ma trận = " + sum);
    }
}
