package Stall;

public class CandyFlossStall extends Stall{

    private int ageRestriction;

    public CandyFlossStall(String name, String ownerName, String location, int ageRestriction) {
        super(name, ownerName, location);
        this.ageRestriction = ageRestriction;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }
}

