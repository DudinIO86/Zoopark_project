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
                case 9:
                    flag=false;
                default:
                    throw new IllegalArgumentException("Недопустимый номер");
            }
        }
    }
}
