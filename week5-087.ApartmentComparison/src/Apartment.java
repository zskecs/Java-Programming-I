
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {

        if (this.squareMeters > otherApartment.squareMeters) {

            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {

        int difference = this.squareMeters * pricePerSquareMeter - otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        return Math.abs(difference);

    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int thisAp = this.squareMeters * pricePerSquareMeter;
        int otherAp = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        if (thisAp > otherAp) {
            return true;
        } else {
            return false;
        }

    }

}
