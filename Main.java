import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //Добавляем массив(вектор) с едой
        Vector<Food> breakfast = new Vector<Food>();
        System.out.println("Do you want food? (Y/n): ");
        //Выбираем, хотим мы есть или нет
        String choice = scanner.nextLine().toLowerCase();
        //сравниваем значения
        //В Java будет не целесообразно сравнивать при помощи ==
        //Будет выводить всегда false (пример: {"a" == "a"} - false)
        //В условии сравнивается не значения (грубо говоря {57 == 57}), a
        //Саим ссылки на объекты
        //Чтобы всё более мение заработало тут я использовал метод equals()
        //Как оно работает:
        //Имя_первой_сравнимой_переменной.equals(Имя_второй_сравнимой_переменной)
        if(choice.equals("y")) {
            while (true) {
                System.out.println("What do you want?");
                System.out.println("I would like to ");
                //Идёт выбор над тем что мы возьмём
                //Грубо говоря scanner - переременная в которую
                // записывается вводимый текст (в данном примере) с консоли.
                //nextLine() - функция которая читает до конца текущей строки
                // (символа перевода строки или конца потока)
                // и возвращает всё, что было в этой строке
                //toLowerCase() - функция для перевода на нижний регистр
                String Name_food = scanner.nextLine().toLowerCase();
                if (Name_food.equals("tea")) {
                    //Добавляем в наш Vector новую переменную
                    breakfast.add(new Tea());
                }
                if (Name_food.equals("pie")) {
                    breakfast.add(new Pie());
                }
                if(Name_food.equals("-c") || Name_food.equals("-calories")){
                    //Функция для вывода калорий
                    Calculate_calories(breakfast);
                }

                System.out.println("Anything else? (Y/n): ");
                Name_food = scanner.nextLine().toLowerCase();
                if(Name_food.equals("n") || Name_food.equals("no")){
                    Calculate_calories(breakfast);
                    System.out.println("Ok, have a nice day!)");
                    break;
                }
                else{
                    continue;
                }
            }
        }
        else{
            System.out.println("Ok, have a nice day!)");
        }
    }
    //Функция для вывода калорий
    public static void Calculate_calories(Vector<Food> breakfast) {
        double max_calories = 0.0f;
        for (int i = 0; i < breakfast.size(); i++){
            max_calories += breakfast.get(i).Calories;
        }
        System.out.println("Calories: " + max_calories);
    }
}
