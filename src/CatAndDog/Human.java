package CatAndDog;

public class Human extends Animal{

    public void feed(Animal animal) {
        if (animal.eat() == "���") {
            System.out.println("�������� ���������");
        }
    }
}
