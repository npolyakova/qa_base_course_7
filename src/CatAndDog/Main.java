package CatAndDog;

public class Main {
    public static void main(String[] args) {
        Human vasya = new Human();
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.meow();
        dog.bark();

        cat.eat();
        dog.eat();

    }
}
