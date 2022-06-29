package DemoInterface;

public class Plane implements FlyingMethods{

    int age;

    @Override
    public void fall(){
        System.out.println("Тревога!");
    }
}
