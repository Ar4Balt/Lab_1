import java.util.Scanner;
//Создается новый Pie класс на основе существующего Food
public class Pie extends Food{
    public Pie(String Filing){
        //обозначает суперкласс, т. е. класс,
        //производным от которого является текущий класс.
        super("pie");
        this.Name = Filing;
        this.Calories = 105.8f;
    }
    public Pie(){
        super("pie");
        this.Name = Choice();
        this.Calories = 105.8f;
    }

    public String Choice(){
        System.out.println("What do you prefer Cherry, Strawberry or Apple? (C/s/a): ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String color_Tea = scanner.nextLine().toLowerCase();
            if (color_Tea.equals("c") ||
                    color_Tea.equals("ch") ||
                    color_Tea.equals("cherry")) {
                return "Cherry";
            }
            if (color_Tea.equals("s") ||
                    color_Tea.equals("st") ||
                    color_Tea.equals("strawberry")) {
                return "Strawberry";
            }
            if (color_Tea.equals("a") ||
                    color_Tea.equals("ap") ||
                    color_Tea.equals("apple")) {
                return "Apple";
            } else {
                System.out.println("Sorry, I don't hear you, please repeat!");
            }
        }
    }
}
