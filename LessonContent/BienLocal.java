package LessonContent;

public class BienLocal {
    public void sayHello() {
        int n=10;
        System.out.println("Gia tri cua n la" + n);
    }
    public static void main(String[] args){
        BienLocal bien = new BienLocal();
            bien.sayHello();
            System.out.println();
    }
}
