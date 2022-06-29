package CatAndDog;

public class Human extends Animal{

    public void feed(Animal animal) {
        if (animal.eat() == "нет") {
            System.out.println("Животное покормили");
        }
    }
}
