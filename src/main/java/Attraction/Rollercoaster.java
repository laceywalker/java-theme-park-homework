package Attraction;

public class Rollercoaster extends Attraction {

    private double heightRestriction;

    public Rollercoaster(String attractionName, double heightRestriction) {
        super(attractionName);
        this.heightRestriction = heightRestriction;
    }

    public double getHeightRestriction() {
        return heightRestriction;
    }
}
