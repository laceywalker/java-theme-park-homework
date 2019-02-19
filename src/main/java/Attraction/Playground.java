package Attraction;

public class Playground extends Attraction {

    private int maximumAge;

    public Playground(String attractionName, int maximumAge) {
        super(attractionName);
        this.maximumAge = maximumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }
}
