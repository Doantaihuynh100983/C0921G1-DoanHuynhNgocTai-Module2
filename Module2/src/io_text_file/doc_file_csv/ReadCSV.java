package io_text_file.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCSV {
    private static final String PATH = "Module2/src/io_text_file/doc_file_csv/countries.csv";

    public static void main(String[] args) {
        File file = new File(PATH);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            List<String[]> list = new ArrayList<>();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line.split(","));
            }
            List<String[]> countries = new ArrayList<>();
            for (String[] element : list) {
                String[] newCountry = {element[0], element[1],element[2], element[3], element[4], element[5]};
                boolean check = false;
                for (String[] country : countries) {
                    if (Arrays.equals(country, newCountry)) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    countries.add(newCountry);
                }
            }
            for (String[] row : countries) {
                System.out.println(Arrays.toString(row));
            }
        } catch (IOException e) {
            System.out.println("File không tồn tại hoặc có lỗi.");
            e.printStackTrace();
        }
    }
}
