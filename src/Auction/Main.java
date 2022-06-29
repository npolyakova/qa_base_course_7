package Auction;

//На аукционе продают разные экспонаты: 2 печатные машины, 1 ручку и 1 карандаш.
//Ведущему аукциона перед его началом нужно записать информацию о каждом предмете: сколько он стоит и как называется.
//И он должен проверить работоспособность каждого экспоната.
//Реализуйте программу с помощью ООП

//ДЗ Добавить покупателей, которые имеют определенную сумму денег и могут покупать экспонаты. Вывод, что экспонат куплен.
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
