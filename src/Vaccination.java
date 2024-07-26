abstract class Vaccine {
    int age = 0;
    String nationality = "";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Vaccine(String nationality, int age) {
    }


    void firstDose() {

    }

    void secondDose() {

    }

    abstract void boosterDose();
}

class VaccinationSuccessfully extends Vaccine {
    public VaccinationSuccessfully(String nationality,int age ) {
       super(nationality,age);

    }

    @Override
    public void boosterDose() {

    }
}

public class Vaccination {
  //  VaccinationSuccessfully ab =new VaccinationSuccessfully("sdf",12);









}
