package Stall;

public class IcecreamStall extends Stall {

    private int price;

    public IcecreamStall(String name, String ownerName, String location, int price) {
        super(name, ownerName, location);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
