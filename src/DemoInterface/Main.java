package DemoInterface;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        plane.fall();

        Baloon baloon = new Baloon();
        baloon.fly();
        baloon.fall();

        Bird bird = new Bird();
        bird.fly();
        bird.fall();
    }
}
