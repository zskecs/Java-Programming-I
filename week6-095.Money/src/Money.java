
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {

        int a = this.euros + added.euros;
        int b = this.cents + added.cents;

        Money c = new Money(a, b);

        return c;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int e = 0;
        int c = 0;
        
        if (decremented.cents>0) {
            c = 100 - decremented.cents;
            
            e = this.euros - decremented.euros-1;
        } else {
            e = this.euros - decremented.euros;
        }
        
            if (e>=0) {
                
             Money f = new Money(e, c);

            return f;
        }

        Money b = new Money(0, 0);

        return b;
    }
}
