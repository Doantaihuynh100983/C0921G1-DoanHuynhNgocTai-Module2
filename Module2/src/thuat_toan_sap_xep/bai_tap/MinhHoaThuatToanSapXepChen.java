package thuat_toan_sap_xep.bai_tap;

public class MinhHoaThuatToanSapXepChen {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int teamp = list[i];
            int j;
            for (j = i - 1; j >= 0 && teamp < list[j]; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = teamp;
        }
    }
}
