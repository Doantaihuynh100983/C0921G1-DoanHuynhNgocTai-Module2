package candidate.service;

import candidate.models.Candidate;
import candidate.models.Experience;

import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceImpl  implements candidateService{


  static  ArrayList<Experience> experiences = new ArrayList<>();
  static  {
      experiences.add(new Experience("Aelbrecht" , "Stefan" , "10/20/2000" , "USA" , 123456, "Stefan@gmail.com" , "5" , "PHP"));
      experiences.add(new Experience("Aguirre" , "Eva" , "20/20/2000" , "USA" , 1234556 , "Eva@gmail.com" , "5" , "JAVA"));
      experiences.add(new Experience("Ahlgren" , "Maria" , "15/6/2000" , "USA" , 123456 , "Maria@gmail.com" , "5" , "AGULAR"));
      experiences.add(new Experience("Antošová" , "Adeleva" , "15/9/2000" , "USA" , 123456 , "Adeleva@gmail.com" , "5" , "JS"));
  }
//    String firstName, String lastName, String birthDate, String address,
//    int phone, String email, String expInYear, String proSkill
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Experience experience = new Experience();
        System.out.println("Enter firstName ");
        experience.setFirstName(scanner.nextLine());
        System.out.println("Enter lastName ");
        experience.setLastName(scanner.nextLine());
        System.out.println("Enter birthDate ");
        experience.setBirthDate(scanner.nextLine());
        System.out.println("Enter address ");
        experience.setAddress(scanner.nextLine());
        System.out.println("Enter phone ");
        experience.setPhone(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter email ");
        experience.setEmail(scanner.nextLine());
        System.out.println("Enter expInYear ");
        experience.setExpInYear(scanner.nextLine());
        System.out.println("Enter proSkill ");
        experience.setProSkill(scanner.nextLine());

        experiences.add(experience);
        disPlay();

    }

    @Override
    public void disPlay() {
      for (Experience experience : experiences){
          System.out.println(experience);
      }
    }

    @Override
    public void edit(String lastName) {
        for (int i = 0 ; i < experiences.size() ; i++){
            if (experiences.get(i).getLastName().equals(lastName)){
                System.out.println("Enter firstName ");
                experiences.get(i).setFirstName(scanner.nextLine());
                System.out.println("Enter lastName ");
                experiences.get(i).setLastName(scanner.nextLine());
                System.out.println("Enter birthDate ");
                experiences.get(i).setBirthDate(scanner.nextLine());
                System.out.println("Enter address ");
                experiences.get(i).setAddress(scanner.nextLine());
                System.out.println("Enter phone ");
                experiences.get(i).setPhone(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter email ");
                experiences.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter expInYear ");
                experiences.get(i).setExpInYear(scanner.nextLine());
                System.out.println("Enter proSkill ");
                experiences.get(i).setProSkill(scanner.nextLine());
            }
        }
        disPlay();

    }


    @Override
    public void searChing(String lastName) {
        for (int i = 0 ; i < experiences.size(); i++){
            if (experiences.get(i).getLastName().equals(lastName)){
                System.out.println(experiences.get(i));
            }
        }
    }

    @Override
    public boolean checkSearch(String lastName) {
        for (int i = 0 ; i < experiences.size();i++){
            if (experiences.get(i).getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
