package AnimalRescuer;

public class Dog extends Animal{

     private String color;
   private int weight;
    private int ageInMonths;
    private String ownerName;
    private String race;
    private String name;
    private boolean isMale;
    private String favoriteFood;
    private String favoritePlaying;
    private int healthCondition;
    private int hunger;

    public String getColor() {
        return this.color}

    public void setColor(String color){
        this.color = color}
    }

    public int getWeight() {
        return this.weight}

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getAgeInMonths() {
        return this.ageInMonths}

    public void setAgeInMonths(int AgeInMonths){
        this.ageInMonths = AgeInMonths;
    }

    public String getOwnerName() {
        return this.ownerName}

    public void setOwnerName(String OwnerName ) {
        this.ownerName = OwnerName;
    }

    public boolean getisMale() {
        return this.isMale}

    public void setisMale(boolean isMale){
        this.isMale = isMale;
    }

    public String getRace() {
        return this.race}

    public void setRace(String race){
        this.race = race;
    }

    public String getName() {
        return this.name}

    public void setName(String name){
        this.name = name;
    }

    public String getFavoriteFood() {
        return this.favoriteFood}

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public String getFavoritePlaying() {
        return this.favoritePlaying}

    public void setFavoritePlaying(String favoritePlaying){
        this.favoritePlaying = favoritePlaying;
    }

    public int getHealthCondition() {
        return this.healthCondition}

    public void setHealthCondition(int healthCondition){
        this.healthCondition = healthCondition;
    }

    public int getHunger(){
        return  this.hunger}

    public void setHunger(int hunger){
        this.hunger = hunger;
    }


    public void  eat(){
        System.out.println("Eating dog food");
    }

    public void sleep (){
        System.out.println("zzzZZZ");
    }

    public void run (){
        System.out.println("Running");
    }
}
