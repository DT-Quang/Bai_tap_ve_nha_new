package Buoi6.animal;

public abstract class Animal {

    public String name;
    public int age;

    public abstract void eat();

    public abstract void makeSound();

    public abstract void action();

    public void run(){
        System.out.println("Animal is running");
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
