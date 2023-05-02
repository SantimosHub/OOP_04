import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainMenu {


    public static void Menu() {
        Random random = new Random();
        ArrayList<Box> boxes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!(str.equals("0"))) {
            System.out.println("""
                    1 - Добавить коробку апельсинов
                    2 - Добавить коробку яблок
                    3 - Показать все коробки
                    4 - Объеднить две коробки
                    5 - Сравнить две коробоки
                    0 - Выход""");
            System.out.print("Выберите действие :");
            str = sc.nextLine();
            if (str.equals("1")) {
                System.out.print("Сколько апельсинов положить? : ");
                str = sc.nextLine();

                Box<Orange> orangeBox = new Box<>();
                for (int i = 0; i < Integer.parseInt(str); i++) {
                    Orange orange = new Orange(0);
                    orangeBox.addFruit(orange);
                }
                boxes.add(orangeBox);

            }
            if (str.equals("2")) {
                System.out.println("Сколько яблок положить? : ");
                str = sc.nextLine();

                Box<Apple> appleBox = new Box<>();
                for (int i = 0; i < Integer.parseInt(str); i++) {
                    Apple apple = new Apple(0);
                    appleBox.addFruit(apple);
                }
                boxes.add(appleBox);

            }
            if (str.equals("3")) {
                Box.showAllBoxes(boxes);
            }
            if (str.equals("4")) {
                System.out.println("Введите № первой коробки");
                String box1 = sc.nextLine();
                System.out.println("Введите № второй коробки");
                String box2 = sc.nextLine();
                boxes.get(Integer.parseInt(box1) - 1).transferFruitsTo(boxes.get(Integer.parseInt(box2) - 1));
                if (boxes.get(Integer.parseInt(box1) - 1).getFruits().isEmpty()) {
                    boxes.remove(Integer.parseInt(box1) - 1);
                }
            }
            if (str.equals("5")) {
                System.out.println("Введите № первой коробки для сравнения : ");
                String box1 = sc.nextLine();
                System.out.println("Введите № второй коробки для сравнения : ");
                String box2 = sc.nextLine();
                System.out.println(boxes.get(Integer.parseInt(box1) - 1).compare(boxes.get(Integer.parseInt(box2) - 1)));
            }

        }
    }
}