package DemoInterface;

public interface FlyingMethods {

    default void fly(){
        System.out.println("�����");
    }

    void fall();
}
