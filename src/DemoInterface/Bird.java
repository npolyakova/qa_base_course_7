package DemoInterface;

public class Bird implements FlyingMethods{

    Boolean hungry;

    @Override
    public void fall(){
        System.out.println("Берегитесь!");
    }
}
