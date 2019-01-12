
public class Main {

    public static void main(String[] args) {
       Money a = new Money(10,155);
Money b = new Money(5,0);



System.out.println(a);  // 10.00e
System.out.println(b);  // 5.00e


         // NOTE: new Money-object is created and reference to that
                        //           is assigned to variable a.
                        //       The Money object 10.00e that variable a used to hold
                        //           is not referenced anymore

System.out.println(a);  // 25.00e
System.out.println(b);  // 5.00e

    }
}
