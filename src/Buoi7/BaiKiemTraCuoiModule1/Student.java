package Buoi7.BaiKiemTraCuoiModule1;

public class Student {

    private String name;

    private int age;

    private String maSV;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Student(String name, int age, String maSV) {
        this.name = name;
        this.age = age;
        this.maSV = maSV;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maSV='" + maSV + '\'' +
                '}';
    }
}
