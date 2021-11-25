package candidate.common;

import candidate.models.Experience;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class doghi_file {


    public void writeToFile(String path, List<Experience> experiences) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(experiences);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Experience>  readDataFromFile(String path){
        List<Experience>  E = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            E = (List<Experience> ) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return E;
    }
}
