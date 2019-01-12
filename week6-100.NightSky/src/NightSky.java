
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int amountOfStars = 0;

    public NightSky(double density) {
        width = 20;
        height = 10;
        this.density = density;

    }

    public NightSky(int width, int height) {

        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.width = width;
        this.height = height;
        this.density = density;
    }

    public void printLine() {

        Random randomizer = new Random();

        for (int i = 0; i < this.width; i++) {
            if (randomizer.nextDouble()      < this.density) {
                System.out.print("*");
                amountOfStars += 1;
            } else {

                System.out.print(" ");
            }

        }

    }

    public void print() {

        for (int i = 0; i < this.height; i++) {

            this.printLine();
            
        }
    }

    public int starsInLastPrint() {
        int temp = this.amountOfStars;
        this.amountOfStars = 0;
        return temp;

    }
}
