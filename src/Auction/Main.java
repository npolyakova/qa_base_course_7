package Auction;

//�� �������� ������� ������ ���������: 2 �������� ������, 1 ����� � 1 ��������.
//�������� �������� ����� ��� ������� ����� �������� ���������� � ������ ��������: ������� �� ����� � ��� ����������.
//� �� ������ ��������� ����������������� ������� ���������.
//���������� ��������� � ������� ���

//�� �������� �����������, ������� ����� ������������ ����� ����� � ����� �������� ���������. �����, ��� �������� ������.
public class Main {
    public static void main(String[] args) {

        TypeMachine tm1 = new TypeMachine(100, "Gloria");
        TypeMachine tm2 = new TypeMachine(120, "Elsa");
        WritingThings pen = new WritingThings(2, "Comus");
        WritingThings pencil = new WritingThings(3, "Kohinor");

        Human performer = new Human();

        performer.checkType(tm1);
        performer.writeTMInfo(tm1);

        performer.checkType(tm2);
        performer.writeTMInfo(tm2);

        pen.setGoodWritingFalse();
        performer.checkWrite(pen);
        performer.writeWTInfo(pen);

        performer.checkWrite(pencil);
        performer.writeWTInfo(pencil);
    }
}
