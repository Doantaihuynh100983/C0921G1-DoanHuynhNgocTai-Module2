package candidate.service;

import candidate.models.Candidate;
import candidate.models.Internship;

import java.util.ArrayList;
import java.util.Scanner;

public class InterShipImpl implements candidateService{
        static ArrayList<Internship> interShipC = new ArrayList<>();
        static  {
            interShipC.add(new Internship("Maria" , "Madeleine" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
            interShipC.add(new Internship("Csokán" , "Babett" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
            interShipC.add(new Internship("Joana" , "Filipa" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
            interShipC.add(new Internship("Patricia" , "Carine" , "30/5/1888" , "ĐÀ NẴNG" , 789456 , "Madeleine@gmail.com" ,"IT" , "3" , "Ngoại Ngữ"));
        }
//    String firstName, String lastName, String birthDate, String address, int phone,
//    String email, String majors, String semester, String universityName
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Internship internship = new Internship();
        System.out.println("Enter firstName ");
        internship.setFirstName(scanner.nextLine());
        System.out.println("Enter lastName ");
        internship.setLastName(scanner.nextLine());
        System.out.println("Enter birthDate ");
        internship.setBirthDate(scanner.nextLine());
        System.out.println("Enter address ");
        internship.setAddress(scanner.nextLine());
        System.out.println("Enter phone ");
        internship.setPhone(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter email ");
        internship.setEmail(scanner.nextLine());
        System.out.println("Enter majors ");
        internship.setMajors(scanner.nextLine());
        System.out.println("Enter semester ");
        internship.setSemester(scanner.nextLine());
        System.out.println("Enter universityName ");
        internship.setUniversityName(scanner.nextLine());


        interShipC.add(internship);
        disPlay();
    }

    @Override
    public void disPlay() {
            for (Internship inter : interShipC){
                System.out.println(inter);
            }
    }

    @Override
    public void edit(String lastName) {
        for (int i = 0 ; i < interShipC.size() ; i++){
            if (interShipC.get(i).getLastName().equals(lastName)){
                System.out.println("Enter firstName ");
                interShipC.get(i).setFirstName(scanner.nextLine());
                System.out.println("Enter lastName ");
                interShipC.get(i).setLastName(scanner.nextLine());
                System.out.println("Enter birthDate ");
                interShipC.get(i).setBirthDate(scanner.nextLine());
                System.out.println("Enter address ");
                interShipC.get(i).setAddress(scanner.nextLine());
                System.out.println("Enter phone ");
                interShipC.get(i).setPhone(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter email ");
                interShipC.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter majors ");
                interShipC.get(i).setMajors(scanner.nextLine());
                System.out.println("Enter semester ");
                interShipC.get(i).setSemester(scanner.nextLine());
                System.out.println("Enter universityName ");
                interShipC.get(i).setUniversityName(scanner.nextLine());
            }
        }
        disPlay();

    }

    @Override
    public void searChing(String lastName) {
        for (int i = 0 ; i < interShipC.size(); i++){
            if (interShipC.get(i).getLastName().equals(lastName)){
                System.out.println(interShipC.get(i));
            }
        }
    }

    @Override
    public boolean checkSearch(String lastName) {
        for (int i = 0 ; i < interShipC.size();i++){
            if (interShipC.get(i).getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
