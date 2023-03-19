package STUDY_MORE._21_DinamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 부모 객체를 선언 후
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("1 : dog or 2 = cat");

        // 이후에 변경 가능!
        int choice = sc.nextInt();
        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            animal.speak();
        }

    }
}
