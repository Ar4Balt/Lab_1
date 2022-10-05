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

                if (scanner.nextLine().toLowerCase().equals("tea")) {
                    breakfast.add(new Tea());
                }
                if (scanner.nextLine().toLowerCase().equals("pie")) {
                    breakfast.add(new Pie());
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
