
public class StringUtils {

    public static boolean included(String word, String searched) {

        String input = word.trim();
        input = input.toUpperCase();

        String search = searched.trim();
        search = search.toUpperCase();
        if (input.contains(search)) {
            return true;
        } else {
            return false;
        }

    }
}
