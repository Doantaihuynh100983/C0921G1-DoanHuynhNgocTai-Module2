package candidate.models;

import java.io.Serializable;

public class Experience extends Candidate implements Serializable{
    private String ExpInYear;
    private String ProSkill;

    public Experience() {
    }

    public Experience(String firstName, String lastName, String birthDate, String address,
                      int phone, String email, String expInYear, String proSkill) {
        super(firstName, lastName, birthDate, address, phone, email);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public String getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(String expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    @Override
    public String toString() {
        return  getFirstName()+'\t' + getLastName()+'\t' + getBirthDate()+'\t' + getAddress()
                +'\t'+ getPhone()+'\t' + getEmail()+'\t' +ExpInYear +'\t' + ProSkill  ;
    }
}
