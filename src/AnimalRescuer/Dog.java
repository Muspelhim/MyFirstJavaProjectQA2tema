package AnimalRescuer;

public abstract class Dog extends Animal{


   private String race;
   private String bark;

   public String getBark(){
       return bark;
   }
   public void setBark(){
       this.bark = bark;
   }


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }



   public void eat(){
       System.out.println("Eating dog food");
   }
}
