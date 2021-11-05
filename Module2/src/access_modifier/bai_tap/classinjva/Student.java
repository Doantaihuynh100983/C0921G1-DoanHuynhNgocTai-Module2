package access_modifier.bai_tap.classinjva;

public class Student {
    private String name = "John";
    private String  class1 = "C02";

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public Student(String name, String class1) {
        this.name = name;
        this.class1 = class1;
    }
}
