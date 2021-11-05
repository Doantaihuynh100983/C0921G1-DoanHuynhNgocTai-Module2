package class_and_obiject_in_java.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3 ,false , 5, "blue");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(3 ,true , 5, "blue");
        System.out.println(fan2.toString());

    }
}
