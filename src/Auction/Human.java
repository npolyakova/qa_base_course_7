package Auction;

public class Human {

    public void checkType(TypeMachine tm) {
        tm.write();
    }

    public void checkWrite(WritingThings wt) {
        wt.write();
    }

    public void writeWTInfo(WritingThings wt){
        System.out.printf("����: %f, ��������: %s \n", wt.getPrice(), wt.getName());
    }

    public void writeTMInfo(TypeMachine tm){
        System.out.printf("����: %f, ��������: %s \n", tm.getPrice(), tm.getName());
    }
}
