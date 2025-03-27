package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {
    private Scanner scanner = new Scanner(System.in);
    public String getUserInput() {
        return scanner.next();
    }
    public int getUserInputItem() {
        return scanner.nextInt();
    }

    ArrayList<Zoopark> tch=new ArrayList<>();
    public void menu(){
        System.out.println("\nМеню выбора");
        System.out.println("1. Посмотреть весь перечень животных");
        System.out.println("2. Добавить новое животное");
        System.out.println("3. Посмотреть список команд животного");
        System.out.println("4. Научить животное новой команде");
        System.out.println("5. Вывести животное по категориям");
        System.out.println("6. Посмотреть подробную информацию о животном");
        System.out.println("7. Удалить животное");
        System.out.println("8. Скорректировать данные животного");
        System.out.println("9. Завершить работу");
        System.out.println("Ваш выбор: ");
    }

    public int selectAnimalMenu(){
        System.out.println("Выберите номер животного.");
        try {
            int numberAnimal = getUserInputItem();
            return numberAnimal;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого животного нет");
        };

        return 0;
    };

}
