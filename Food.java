public abstract class Food implements Consumable {
    public String Name;
    protected double Calories = 0.0f;

    public Food(String Name, double Calories){
        this.Name = Name;
        this.Calories = Calories;
    }
    public Food(String Name){
        this.Name = Name;
        this.Calories = 0.0f;

    }
    public Food(double Calories){
        this.Name = "Anything";
        this.Calories = Calories;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setCalories(double Calories){
        this.Calories = Calories;
    }
    public double getCalories(){
        return Calories;
    }

    public void consume(){
        System.out.println(this + " has been eaten");
    }

}