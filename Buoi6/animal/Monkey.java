package Buoi6.animal;

public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("Monkey eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is chattering");
    }

    @Override
    public void action() {
        System.out.println("Monkey is climbing trees");
    }
}
