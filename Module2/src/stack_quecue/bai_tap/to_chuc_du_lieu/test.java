package stack_quecue.bai_tap.to_chuc_du_lieu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        ArrayList<Person> arrayListOutput = new ArrayList<>();
        arrayList.add(new Person("Nguyễn văn A", "nam", "21/10/2000"));
        arrayList.add(new Person("Nguyễn văn B", "nam", "11/11/1998"));
        arrayList.add(new Person("Nguyễn Hiền", "nữ", "21/01/2001"));
        arrayList.add(new Person("Nguyễn văn A", "nam", "21/10/2000"));
        arrayList.add(new Person("nguyễn Thu Hiền", "nữ", "16/06/1998"));
        arrayList.add(new Person("Nguyễn Thảo Nhi", "nữ", "10/10/1998"));
        arrayList.add(new Person("Nguyễn văn C", "nam", "21/10/2002"));

        Collections.sort(arrayList, new sapxep());
        for (Person e : arrayList) {
            System.out.println(e);
        }
        Queue<Person> nam = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();

        for (Person person : arrayList){
            if (person.getGioiTinh().equals("nam")){
                nam.add(person);
            }else {
                nu.add(person);
            }
        }
        while (!nu.isEmpty()){
            arrayListOutput.add(nu.poll());
        }
        while (!nam.isEmpty()){
            arrayListOutput.add(nam.poll());
        }
        System.out.println("Sau khi tổ chức lại dữ liệu");
        for (Person e : arrayListOutput) {
            System.out.println(e);
        }
    }

}
