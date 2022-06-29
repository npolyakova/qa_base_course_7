package Auction;

public class Things {

    private double price;
    private String name;

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Things(double price, String name) {
        setPrice(price);
        setName(name);
    }
}
