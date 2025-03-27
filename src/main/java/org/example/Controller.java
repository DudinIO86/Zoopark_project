package org.example;

public class Controller {
    private Zoopark model;
    private Display view;

    public Controller(Zoopark model, Display view){
        this.model=model;
        this.view=view;
    }

    public void run(){
        boolean flag=true;
        while(flag==true){
            view.menu();
            int item=view.getUserInputItem();
            switch(item){
                case 1:
                    model.getListAnimal();
                    break;
                case 2:
                    model.addAnimal();
                    break;
                case 3:
                    model.getListCommandAnimal(view.selectAnimalMenu());
                    break;
                case 4:
                    model.learnNewCommandAnimal(view.selectAnimalMenu());
                    break;
                case 5:
                    model.showAnimalCategory();
                    break;
                case 6:
                    model.getFullInfoAnimal(view.selectAnimalMenu());
                    break;
                case 7:
                    model.delAnimal(view.selectAnimalMenu());
                    break;
                case 8:
                    model.correctAnimal(view.selectAnimalMenu());
                    break;
                case 9:
                    flag=false;
                default:
                    throw new IllegalArgumentException("Недопустимый номер");
            }
        }
    }
}
