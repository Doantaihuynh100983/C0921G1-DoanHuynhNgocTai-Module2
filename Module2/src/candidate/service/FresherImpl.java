package candidate.service;

import candidate.models.Candidate;
import candidate.models.Fresher;
import test_doc_ghi_file.FileUntiels;

import java.util.ArrayList;
import java.util.Scanner;

public class FresherImpl  implements candidateService{

//    public static final String FILE_NAME = "Module2/src/candidate/data/Fresher.csv";
//    public static final String COMMA = ",";
//    FileUntiels fileUntiels = new FileUntiels();
    static ArrayList<Fresher> freshers = new ArrayList<>();
    static {
         freshers.add(new Fresher("Barbosa" , "De Souza" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
         freshers.add(new Fresher("Cabrera" , "Cornide" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
         freshers.add(new Fresher("Calderon" , "Cuevas" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
         freshers.add(new Fresher("Casulari" , "Motta" , "20/11/1990" ,"ẤN ĐỘ" , 23654789 , "Souza@gmail.com" , "30/5/2021" , "Good","Duy Tân"));
    }

//    public void writeFile(){
//        String line = null;
//        for (Fresher experience : freshers){
//            line = experience.getFirstName() + COMMA + experience.getLastName() + COMMA + experience.getBirthDate() + COMMA +
//                    experience.getAddress() + COMMA +    experience.getPhone() + COMMA +   experience.getEmail() + COMMA +
//                    experience.getGraduation_date() + COMMA +   experience.getGraduation_rank() + COMMA +   experience.getEducation();
//            fileUntiels.writeFile(FILE_NAME,line);
//        }
//    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Fresher fresher = new Fresher();
        System.out.println("Enter firstName ");
        fresher.setFirstName(scanner.nextLine());
        System.out.println("Enter lastName ");
        fresher.setLastName(scanner.nextLine());
        System.out.println("Enter birthDate ");
        fresher.setBirthDate(scanner.nextLine());
        System.out.println("Enter address ");
        fresher.setAddress(scanner.nextLine());
        System.out.println("Enter phone ");
        fresher.setPhone(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter email ");
        fresher.setEmail(scanner.nextLine());
        System.out.println("Enter graduation_date ");
        fresher.setGraduation_date(scanner.nextLine());
        System.out.println("Enter graduation_rank ");
        fresher.setGraduation_rank(scanner.nextLine());
        System.out.println("Enter education ");
        fresher.setEducation(scanner.nextLine());

        freshers.add(fresher);
        disPlay();

    }

    @Override
    public void disPlay() {
            for (Fresher fresher : freshers){
                System.out.println(fresher);
            }
    }

    @Override
    public void edit(String lastName) {
        for (int i = 0 ; i < freshers.size() ; i++){
            if (freshers.get(i).getLastName().equals(lastName)){
                System.out.println("Enter firstName ");
                freshers.get(i).setFirstName(scanner.nextLine());
                System.out.println("Enter lastName ");
                freshers.get(i).setLastName(scanner.nextLine());
                System.out.println("Enter birthDate ");
                freshers.get(i).setBirthDate(scanner.nextLine());
                System.out.println("Enter address ");
                freshers.get(i).setAddress(scanner.nextLine());
                System.out.println("Enter phone ");
                freshers.get(i).setPhone(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter email ");
                freshers.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter graduation_date ");
                freshers.get(i).setGraduation_date(scanner.nextLine());
                System.out.println("Enter graduation_rank ");
                freshers.get(i).setGraduation_rank(scanner.nextLine());
                System.out.println("Enter education ");
                freshers.get(i).setEducation(scanner.nextLine());
            }
        }
        disPlay();

    }

    @Override
    public void searChing(String lastName) {
        for (int i = 0 ; i < freshers.size(); i++){
            if (freshers.get(i).getLastName().equals(lastName)){
                System.out.println(freshers.get(i));
            }
        }
    }

    @Override
    public boolean checkSearch(String lastName) {
        for (int i = 0 ; i < freshers.size();i++){
            if (freshers.get(i).getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
