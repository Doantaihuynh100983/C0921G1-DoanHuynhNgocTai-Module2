import java.util.Iterator;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<Integer> interator = new TreeSet<>();
        interator.add(3);
        interator.add(1000);
        interator.add(100);
        interator.add(9);
        interator.add(66);
        interator.add(54);
        interator.add(566);


        Iterator<Integer> ok = interator.descendingIterator();
        while (ok.hasNext()){
            System.out.println(ok.next());
        }

    }
}
