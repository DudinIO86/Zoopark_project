package org.example;

import java.sql.SQLOutput;
import java.util.*;

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
    public void getListCommandAnimal(int numberAnimal){
        System.out.println("Животное выполняет команду: "+zoo.get(numberAnimal).get_command());
    };

    public void learnNewCommandAnimal(int numberAnimal){};

    public void showAnimalCategory(){

        if (zoo.isEmpty()){
            System.out.println("Животных в зоопарке нет");
        } else {
            List <String> categ=new ArrayList<>();

            Iterator<Animal> iterator = zoo.iterator();
            while (iterator.hasNext()) {
                Animal zoo = iterator.next();
                categ.add(zoo.get_category());
            }
            System.out.println("Список категорий животных в зоопарке:");
            LinkedHashSet <String> array=new LinkedHashSet<String>(categ);
            Iterator<String> iterator2 = array.iterator();
            while (iterator2.hasNext()) {
                String array2 = String.valueOf(iterator2.next());
                System.out.println(array2);
            }
            System.out.println("Введите категорию, по которым вывести животных:");
            String inputCategory = String.valueOf(getUserInput());

            Iterator<Animal> iterator3 = zoo.iterator();
            System.out.println("Ваш список животных:");
            while (iterator3.hasNext()) {
                Animal zoo = iterator3.next();
                if(zoo.get_category().equals(inputCategory)){
                    System.out.println(zoo.get_id() + ". " + zoo.get_name());
                };
            }
        }
    };


    public void getFullInfoAnimal(int numberAnimal){
            System.out.println("Номер животного: " + zoo.get(numberAnimal).get_id());
            System.out.println("Имя животного: " + zoo.get(numberAnimal).get_name());
            System.out.println("Категория животного: " + zoo.get(numberAnimal).get_category());
            System.out.println("Тип животного: " + zoo.get(numberAnimal).get_type());
            System.out.println("Возраст животного: " + zoo.get(numberAnimal).get_age());
            System.out.println("Комманды животного: " + zoo.get(numberAnimal).get_command() + "\n");
    };
    public void delAnimal(int numberAnimal){
        zoo.remove(numberAnimal-1);
    };

    public void correctAnimal(int numberAnimal){};

}
