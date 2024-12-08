package Buoi6;

public class Elephant extends Animal {
    public void trumpet(){
        System.out.println(" Elephant is trumpeting");
    }
    public void eat(){
        System.out.println(" Elephant eat grass");
    }
    public void makeSound(){
        System.out.println(" Elephant makes sound");
    }
    public void action(){
        System.out.println("The elephant is spraying water");
    }

    public void showInfo(String name , int age) {
        super.setName(name);
        super.setAge(age);
    }

}
