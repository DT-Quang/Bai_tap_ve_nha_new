package Buoi6;

public abstract class Animal {

    private String name;
    private int age;

    public void eat(){
        System.out.println("Animal eating");
    }

//    public String getName() {
//        return name;
//    }
    public void setName(String name) {
        this.name = name;
    }
//    public int getAge() {
//        return age;
//    }
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();


    public abstract void action();

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
