package candidate.models;

public class Fresher extends Candidate{
        private  String Graduation_date;
        private  String Graduation_rank;
        private String Education;

    public Fresher() {
    }

    public Fresher(String firstName, String lastName, String birthDate, String address, int phone,
                   String email, String graduation_date, String graduation_rank, String education) {
        super(firstName, lastName, birthDate, address, phone, email);
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public String toString() {
        return   getFirstName()+'\t' + getLastName()+'\t' + getBirthDate()+'\t' + getAddress()
                +'\t'+ getPhone()+'\t' + getEmail()+'\t' +Graduation_date + '\'' + Graduation_rank + '\'' + Education + '\'';
    }
}
