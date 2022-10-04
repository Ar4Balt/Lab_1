import java.io.IOException;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Vector<Food> breakfast = new Vector<Food>();
        System.out.println("Do you want food? (Y/n): ");
        String choice = scanner.nextLine().toLowerCase();
        if(choice.equals("y")) {
            while (true) {
                System.out.println("What do you want?");
                System.out.println("I would like to ");

                String Name = scanner.nextLine().toLowerCase();
                switch (Name) {
                    case "tea":
                        breakfast.add(new Tea());
                }

                System.out.println("Anything else? (Y/n): ");
                choice = scanner.nextLine();
                if(choice.toLowerCase().equals("n")){
                    System.out.println("Ok, have a nice day!)");
                    break;
                }
            }
        }
        else{
            System.out.println("Ok, have a nice day!)");
        }
    }

}
