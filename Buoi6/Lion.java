package Buoi6;

public class Lion extends Animal {


    public void roar() {

        System.out.println("Lion is roaring");
    }

    public void eat() {
        System.out.println("Lion eat meat");
    }

    public void makeSound() {
        System.out.println("Lion makes sound");
    }

    public void action() {
        System.out.println("The lion is hunting");
    }

    public void showInfo(String name , int age) {
        super.setName(name);
        super.setAge(age);
    }
}
