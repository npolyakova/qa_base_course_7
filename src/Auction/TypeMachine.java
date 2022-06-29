package Auction;

public class TypeMachine extends Things implements Write{

    public TypeMachine(double price, String name) {
        super(price, name);
    }

    @Override
    public void write() {
        System.out.println("Печатает хорошо");
    }

}
