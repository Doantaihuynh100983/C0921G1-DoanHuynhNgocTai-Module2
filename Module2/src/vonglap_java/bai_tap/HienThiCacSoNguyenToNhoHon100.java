package vonglap_java.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static boolean snt(int n){
            if (n < 2 ){
                return false;
            }
            for (int i = 2 ; i < n ; i++){
                    if (n % i == 0){
                        return false ;
                    }
            }
            return true ;
    }

    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Mời nhập số từ 2 -> 100");
             number = sc.nextInt();
        }while ((number < 2) || (number >100));

        for (int i = 0 ; i < number ; i++){
            if (snt(i)){
                System.out.println(i);
            }

        }

    }

    }

