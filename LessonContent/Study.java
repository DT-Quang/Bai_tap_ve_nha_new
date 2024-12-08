package LessonContent;

public class Study {
    private int var1;
    public static int var2 =28;
    protected String var3 = "Xin chao";
    int bien4 = 2;
    int bien6;

    public static void main(String args[]){
        System.out.println("Hello, Today is Thursday, 26/09/2024");
        int bien5 = 10;
        int bien7;
        Study study = new Study();
        System.out.println("gia tri :"+ study.bien6 + " " );
        hamThu1(bien5);
        method2();

        study.hamThu3(bien5);
    }

    public static void hamThu1(int value){
        Study study = new Study();
        System.out.println("Gia tri bien instance bien4 :" + study.bien4);
        int bien6 = 20;
        for (int i=1; i <= value;i++){
            System.out.println("I love you " + i);
        }
    }

    public static void method2(){
        System.out.println("Day la ham thu 2");
    }

    public void hamThu3(int value){
        for (int i=1; i <= value;i++){
            System.out.println("I love you " + i);
        }
    }
}
