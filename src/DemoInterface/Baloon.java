package DemoInterface;

public class Baloon implements FlyingMethods{

    String color;

    @Override
    public void fall(){
        System.out.println("Пора купить новый шарик");
    }
}
