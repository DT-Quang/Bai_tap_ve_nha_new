package Buoi6;

public class BaiTap1 {
    public static void main(String[] args) {
        Animal voi = new Elephant();
        if(voi instanceof Elephant){
            ((Elephant)voi).eat();
        }
        Elephant voi2 = new Elephant();
        voi2.trumpet();
        voi2.makeSound();
        Animal suTu = new Lion();
        if(suTu instanceof Lion){
            ((Lion)suTu).eat();
        }
        Lion suTu2 = new Lion();
        suTu2.roar();
        suTu2.makeSound();
    }

}
