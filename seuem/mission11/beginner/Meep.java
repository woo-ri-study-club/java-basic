package seuem.mission11.beginner;

public class Meep {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
}
