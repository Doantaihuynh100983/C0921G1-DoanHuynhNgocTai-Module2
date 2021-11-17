package test_doc_ghi_file;

import com.sun.java_cup.internal.runtime.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            final String File_Name = "Module2/src/test_doc_ghi_file/data/Student.csv";
            final String ComMa = ",";

//        Student student1  = new Student("tài","19");
//        Student student2  = new Student("tài","20");
//        Student student3  = new Student("tài","21");

        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);

            String line = null;
            FileUntiels fileUntiels = new FileUntiels();
        for (Student student : students){
            line = student.getName() + ComMa + student.getAge();

            fileUntiels.writeFile(File_Name,line);
        }



        List<String> listLine =fileUntiels.readFile(File_Name);
        for (String lScanner : listLine){
            System.out.println(lScanner);
        }


    }
}
