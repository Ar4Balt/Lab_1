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
                if (scanner.nextLine().toLowerCase().equals("tea")) {
                    //Добавляем в наш Vector новую переменную
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
