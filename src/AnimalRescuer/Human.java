package AnimalRescuer;

public abstract class Human {
    private String eyeColour;
    private float heightInCentimeters;
    private String race;
    private String hairColour;
    private int ageInYears;
    private String nationality;
    private String gender;
    private String name;
    private Boolean isMale;

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

   

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public float getHeightInCentimeters() {
        return heightInCentimeters;
    }

    public void setHeightInCentimeters(float heightInCentimeters) {
        this.heightInCentimeters = heightInCentimeters;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public void isMale(boolean b) {
    }
    public void eat(){
        System.out.println("Eating food");
    }
}
