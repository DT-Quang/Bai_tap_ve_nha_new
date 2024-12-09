package Buoi6.animal;

import java.util.ArrayList;

public class ManagerAnimal {

    private ArrayList<Animal> animals; // Danh sách động vật
    private int capacity; // Sức chứa ban đầu

    // Constructor
    public ManagerAnimal(int capacity) {
        this.capacity = capacity;
        this.animals = new ArrayList<>(capacity);
    }

    // Hiển thị danh sách động vật
    public void showAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
            return;
        }
        for (Animal animal : animals) {
            animal.showInfo();
            animal.action();
        }
    }

    // Thêm động vật
    public void addAnimal(Animal animal) {
        if (animals.size() >= capacity) {
            capacity += 10; // Mở rộng danh sách
            System.out.println("List is full. Extending capacity to " + capacity);
        }
        animals.add(animal);
        System.out.println("Added: " + animal.getName());
    }

    // Tìm động vật theo tên (không phân biệt hoa thường)
    public Animal findAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    // Xóa động vật theo tên
    public void removeAnimal(String name) {
        Animal animal = findAnimal(name);
        if (animal != null) {
            animals.remove(animal);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Animal not found.");
        }
    }

}
