package CatAndDog;

public class Animal {
    private String hungry;

    public void setHungry(){
        hungry = "��";
        System.out.println("�������� ������������");
    }

    public String eat(){
        if (hungry == "��"){
            this.hungry = "���";
        }
        return hungry;
    }
}
