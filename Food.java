public abstract class Food implements Consumable {
    public String Name;
    protected double Calories = 0.f;

    public Food(String Name, double Calories){
        this.Name = Name;
        this.Calories = Calories;
    }
    public Food(String Name){
        this.Name = Name;
        this.Calories =  Double.parseDouble(Name);

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
    /*
    protected String name = null;
    protected double colories = 0.f;

    public Food(String name, double colories) {
        this.name = name;
        this.colories = colories;
    }

    public void setColories(double colories) {
        this.colories = colories;
    }
    public double getColories() {
        return colories;
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(){
        name = null;
    }


    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}' + "";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) {
            return false;
        }
        if (name==null || ((Food)arg0).name==null) {
            return false;
        }
        return name.equals(((Food)arg0).name);
    }

    public void consum() {
        System.out.println(this + "has been eaten");
    }
*/
}