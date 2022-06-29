package DemoAbstract;

public class Guitar extends Instruments {

    @Override
    public void play(){
        System.out.println("Играет");
    }

    @Override
    public void set(){
        System.out.println("Настраивается");
    }
}
