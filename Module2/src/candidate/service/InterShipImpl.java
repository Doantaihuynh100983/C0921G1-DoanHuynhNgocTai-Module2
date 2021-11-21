package candidate.service;

import candidate.models.Candidate;
import candidate.models.Internship;

import java.util.ArrayList;

public class InterShipImpl implements candidateService{
        static ArrayList<Candidate> interShipC = new ArrayList<>();
        static  {
            interShipC.add(new Internship("Maria" , "Madeleine" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
            interShipC.add(new Internship("Csokán" , "Babett" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
            interShipC.add(new Internship("Joana" , "Filipa" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
            interShipC.add(new Internship("Patricia" , "Carine" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
        }
    @Override
    public void add() {

    }

    @Override
    public void disPlay() {
            for (Candidate inter : interShipC){
                System.out.println(inter);
            }
    }

    @Override
    public void edit() {

    }

    @Override
    public void searChing() {

    }
}
