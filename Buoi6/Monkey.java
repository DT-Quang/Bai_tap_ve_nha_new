package Buoi6;

public class Monkey extends Animal{
    public void makeSound() {
        System.out.println("Monkey makes sound");
    }

    public void eat(){
        System.out.println(" Elephant eat banana");
    }
    public void action(){
        System.out.println("The monkey is climbing tress ");
    }

    public void showInfo(String name , int age) {
        super.setName(name);
        super.setAge(age);
    }

}
