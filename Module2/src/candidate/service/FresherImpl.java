package candidate.service;

import candidate.models.Candidate;
import candidate.models.Fresher;

import java.util.ArrayList;

public class FresherImpl  implements candidateService{
//    String firstName, String lastName, String birthDate, String address, int phone,
//    String email, String graduation_date, String graduation_rank, String education

    static ArrayList<Candidate> freshers = new ArrayList<>();
    static {
         freshers.add(new Fresher("Barbosa" , "De Souza" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
         freshers.add(new Fresher("Cabrera" , "Cornide" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
         freshers.add(new Fresher("Calderon" , "Cuevas" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
         freshers.add(new Fresher("Casulari" , "Motta" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
    }
    @Override
    public void add() {

    }

    @Override
    public void disPlay() {
            for (Candidate fresher : freshers){
                System.out.println(fresher);
            }
    }

    @Override
    public void edit() {

    }

    @Override
    public void searChing() {

    }
}
