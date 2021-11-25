package FuramaResort.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile<T> {


    public void writeToFile(String path, List<T> furuma) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(furuma);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> readDataFromFile(String path){
        List<T> furuma = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            furuma = (List<T>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return furuma;
    }
}
