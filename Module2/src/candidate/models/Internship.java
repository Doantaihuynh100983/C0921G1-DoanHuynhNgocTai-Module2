package candidate.models;

public class Internship extends Candidate{
    private String majors;
    private String semester;
    private String universityName;

    public Internship() {
    }

    public Internship(String firstName, String lastName, String birthDate, String address, int phone,
                      String email, String majors, String semester, String universityName) {
        super(firstName, lastName, birthDate, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return  getFirstName()+'\t' + getLastName()+'\t' + getBirthDate()+'\t' + getAddress()
                +'\t'+ getPhone()+'\t' + getEmail()+'\t' + majors + '\'' + semester + '\'' + universityName + '\'' ;
    }
}
