package Auction;

public class WritingThings extends Things implements Write{

    private Boolean goodWriting = true;

    public void setGoodWritingFalse() {
        goodWriting = false;
    }

    @Override
    public void write() {
        if(goodWriting == true){
            System.out.println("����� ������");
        }
        else {
            System.out.println("�� �����");
        }
    }

    public WritingThings(double price, String name) {
        super(price, name);
    }
}
