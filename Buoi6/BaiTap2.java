package Buoi6;

public class BaiTap2 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
         Animal lion = new Lion();
         animals[0] = lion;

         Animal elephant = new Elephant();
         animals[1] = elephant;

         Animal monkey = new Monkey();
         animals[2] = monkey;


//         animals[0].eat();
//         animals[1].eat();
//         animals[2].eat();

         for (Animal a : animals) {
             a.eat();
             a.action();
         }
    }
}
