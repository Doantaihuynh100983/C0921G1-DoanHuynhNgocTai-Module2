package candidate.service;

import candidate.models.Candidate;
import candidate.models.Experience;

import java.util.ArrayList;

public class ExperienceImpl  implements candidateService{


  static  ArrayList<Candidate> experiences = new ArrayList<>();
  static  {
      experiences.add(new Experience("Aelbrecht" , "Stefan" , "10/20/2000" , "USA" , 123456, "Stefan@gmail.com" , "5" , "PHP"));
      experiences.add(new Experience("Aguirre" , "Eva" , "20/20/2000" , "USA" , 1234556 , "Eva@gmail.com" , "5" , "JAVA"));
      experiences.add(new Experience("Ahlgren" , "Maria" , "15/6/2000" , "USA" , 123456 , "Maria@gmail.com" , "5" , "AGULAR"));
      experiences.add(new Experience("Antošová" , "Adeleva" , "15/9/2000" , "USA" , 123456 , "Adeleva@gmail.com" , "5" , "JS"));
  }
    @Override
    public void add() {

    }

    @Override
    public void disPlay() {
      for (Candidate experience : experiences){
          System.out.println(experience);
      }
    }

    @Override
    public void edit() {

    }

    @Override
    public void searChing() {

    }
}
