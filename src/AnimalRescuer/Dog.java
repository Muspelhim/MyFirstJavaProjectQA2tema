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
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoritePlaying() {
        return favoritePlaying;
    }

    public void setFavoritePlaying(String favoritePlaying) {
        this.favoritePlaying = favoritePlaying;
    }

    public int getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(int healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }



}
