
public class Main {

    public static void main(String[] args) {
        MyDate day = new MyDate(29, 12, 2011);

        day.advance();
        day.advance();
        System.out.println(day);

    }
}
