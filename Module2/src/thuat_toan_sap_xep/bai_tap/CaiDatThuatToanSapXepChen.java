package thuat_toan_sap_xep.bai_tap;

public class CaiDatThuatToanSapXepChen {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int teamp = list[i];
            int j;
            for (j = i - 1; j >= 0 && teamp < list[j]; j--) {
                System.out.println(list[j] +j +(j + 1));
                list[j + 1] = list[j];
            }
            if (j == i - 1) {
                System.out.println(teamp +  (j + 1) );
            } else {
                System.out.println(teamp + (j + 1));
            }
            list[j + 1] = teamp;
            System.out.print( i );
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();
        }
    }
}
