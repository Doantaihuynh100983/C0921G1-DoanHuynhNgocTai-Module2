package test_doc_ghi_file.s15_exception;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    static Map<Person, Integer> maps = new LinkedHashMap<>();

    public static void add(Person person){
        if(maps.containsKey(person)){
            int currentValue = maps.get(person);
            maps.put(person, currentValue + 1);
        } else {
            maps.put(person,1);
        }
    }
    public static void main(String[] args) {
        Person person_1 = new Person("a");
        Person person_2 = new Person("a");
        Person person_3 = new Person("b");

        add(person_1);
        add(person_2);
        add(person_3);

        for(Map.Entry<Person, Integer> map: maps.entrySet()){
            System.out.println(map.getKey() + " - " + map.getValue());
        }


    }
}
