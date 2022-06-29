package CatAndDog;

public class Animal {
    private String hungry;

    public void setHungry(){
        hungry = "да";
        System.out.println("Животное проглодалось");
    }

    public String eat(){
        if (hungry == "да"){
            this.hungry = "нет";
        }
        return hungry;
    }
}
