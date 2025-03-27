package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Zoopark implements Commands {
    List<Animal> zoo=new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public String getUserInput() {
        return scanner.next();
    }
    public int getUserInputItem() {
        return scanner.nextInt();
    }

    public void addAnimal(){
        System.out.println("Введите имя животного: ");
        String name = String.valueOf(getUserInput());
        System.out.println("Введите категорию животного: ");
        String category = String.valueOf(getUserInput());
        System.out.println("Введите тип животного: ");
        String type = String.valueOf(getUserInput());
        System.out.println("Введите возраст животного: ");
        String age = String.valueOf(getUserInput());
        System.out.println("Введите комманду животного: ");
        String command = String.valueOf(getUserInput());
        int id=zoo.size()+1;
        Animal animal=new Animal(name,category,type,Integer.parseInt(age),command,id);
        zoo.add(animal);
    }
    public void getListAnimal(){
        if (zoo.isEmpty()){
            System.out.println("Животных в зоопарке нет");
        } else {
            Iterator<Animal> iterator = zoo.iterator();
            System.out.println("Ваш список животных:");
            while (iterator.hasNext()) {
                Animal zoo = iterator.next();
                System.out.println(zoo.get_id() + ". " + zoo.get_name());
            }
        }
    };
    public void getListCommandAnimal(int numberAnimal){};

    public void learnNewCommandAnimal(int numberAnimal){};

    public void showAnimalCategory(){};

    public void getFullInfoAnimal(int numberAnimal){
            System.out.println("Номер животного: " + zoo.get(numberAnimal).get_id());
            System.out.println("Имя животного: " + zoo.get(numberAnimal).get_name());
            System.out.println("Категория животного: " + zoo.get(numberAnimal).get_category());
            System.out.println("Тип животного: " + zoo.get(numberAnimal).get_type());
            System.out.println("Возраст животного: " + zoo.get(numberAnimal).get_age());
            System.out.println("Комманды животного: " + zoo.get(numberAnimal).get_command() + "\n");
    };
    public void delAnimal(int numberAnimal){};

    public void correctAnimal(int numberAnimal){};

}
