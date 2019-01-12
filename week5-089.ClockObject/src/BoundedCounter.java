
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {

        this.upperLimit = upperLimit;
    }

    public void next() {

        if (this.value < this.upperLimit) {
            this.value = this.value + 1;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {

            return "0" + value;
        }
        return "" + this.value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int number) {
        if (number >= 0 && number <=this.upperLimit) {
            this.value = number;
        }
    }
    
}

