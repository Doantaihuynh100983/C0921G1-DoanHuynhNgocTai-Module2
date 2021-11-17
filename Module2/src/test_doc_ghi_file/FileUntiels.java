package test_doc_ghi_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntiels {
    public void writeFile(String pathFile, String line){
        try {
            FileWriter fileWriter = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFile(String pathFlie){
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFlie);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null ;
            while ((line = bufferedReader.readLine()) !=null){
                listLine.add(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            return listLine;
    }
}
