import java.util.Scanner;
//Создается новый Pie класс на основе существующего Food
public class Pie extends Food{
    public Pie(String Filing){
        //обозначает суперкласс, т. е. класс,
        //производным от которого является текущий класс.
        super("pie");
        this.Name = Filing;
        this.Calories = 45.8f;
    }
    public Pie(){
        super("pie");
        this.Name = Choice();
        this.Calories = 45.8f;
    }

    public String Choice(){
        System.out.println("What do you prefer Cherry, Strawberry or Apple? (G/b): ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String color_Tea = scanner.nextLine().toLowerCase();
            if (color_Tea.equals("g") ||
                    color_Tea.equals("gr") ||
                    color_Tea.equals("green")) {
                return "green";
            }
            if (color_Tea.equals("b") ||
                    color_Tea.equals("bl") ||
                    color_Tea.equals("black")) {
                return "black";
            } else {
                System.out.println("Sorry, I don't hear you, please repeat!");
            }
        }
    }
}
