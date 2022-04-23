package AnimalRescuer;

public class Veterinarian extends Human {

    private String specialization;


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization() {
        this.specialization = "medicinaGenerala";
    }
    public void eat(){
        System.out.println("Eating Omelete");
    }
    public void speak(){
        System.out.println("Hi patient");
    }
}


