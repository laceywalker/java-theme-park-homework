package Stall;

public class Stall {
    private String name;
    private String ownerName;
    private String location;

    public Stall(String name, String ownerName, String location){
        this.name = name;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getStallName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }
}
