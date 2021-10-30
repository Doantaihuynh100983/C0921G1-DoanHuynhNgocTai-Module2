package VongLapJaVa.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static boolean snt(int n ){
            if (n < 2 ){
                return false ;
            }
            for (int i = 2 ; i < n; i++){
                if ( n % i == 0){
                    return false ;
                }
            }
            return true ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số lượng nguyên tố ");
            int count = 0 ;
            int n = 2 ;
        int numBer = sc.nextInt();

        while (count < numBer){
            if (snt(n)){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
