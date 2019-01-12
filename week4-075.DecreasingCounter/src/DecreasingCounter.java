public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    
    private int rememberValue;
    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.rememberValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        
        if (value>0) {
            
        
        value--;
        }
        System.out.println("value: " + this.value);
        
    }

    public void reset() {
        
        value = 0;
    }
    
    public void setInitial() {
        
    System.out.println("value: " + rememberValue);

        
    }
}
