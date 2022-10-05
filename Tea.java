import java.util.Scanner;
//Создается новый Tea класс на основе существующего Food
public class Tea extends Food{
    public Tea(String Color){
        //обозначает суперкласс, т. е. класс,
        //производным от которого является текущий класс.
        super("tea");
        this.Name = Color;
        this.Calories = 45.8f;
    }
    public Tea(){
        super("tea");
        this.Name = Choice();
        this.Calories = 45.8f;
    }

    public String Choice(){
        System.out.println("What do you prefer green or black? (G/b): ");
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
