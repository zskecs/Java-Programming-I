import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int i = 0;
        int b = 1;
        
        String help = "";
        int c = text.length();

        while (i < c) {

            char Character = text.charAt(text.length() - b);

            System.out.print(Character);
            i++;
            b++;

            help = help + Character;

        }
        
        return help.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
