package org.example;

public class Animal {
    private String name;
    private String category;
    private String type;
    private int age;
    private String command;
    private int id;

    public Animal(String name,String category,String type,int age,String command,int id) {
        this.name=name;
        this.category=category;
        this.type=type;
        this.age=age;
        this.command=command;
        this.id=id;
    }

    public String get_name(){
        return this.name;
    }

    public String get_category(){
        return this.category;
    }

    public int get_age(){
        return this.age;
    }

    public String get_type(){
        return this.type;
    }
    public int get_id(){
        return this.id;
    }

//    @Override
//    public String toString(){
//        return "Название книги: "+title+"\n"+"Автор: "+author+"\n"+"Год издания: "+publishedYear+"\n";
//    }

}
