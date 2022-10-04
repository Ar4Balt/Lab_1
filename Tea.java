import java.util.Scanner;

public class Tea extends Food{
    public Tea(String Color){
        super("tea");
        this.Name = Color;
        this.Calories = Double.parseDouble(Color);
    }
    public Tea(){
        super("tea");
        this.Name = Choice();
        this.Calories = Double.parseDouble(Choice());
    }

    public String Choice(){
        System.out.println("What do you prefer green or black? (G/b): ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.nextLine().toLowerCase().equals("g")) {
                return scanner.nextLine().toLowerCase();
            }
            if (scanner.nextLine().toLowerCase().equals("b")) {
                return scanner.nextLine().toLowerCase();
            } else {
                System.out.println("Sorry, I don't hear you, please repeat!");
            }
        }
    }
}
