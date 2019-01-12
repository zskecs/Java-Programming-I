
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {

        if (this.meals.contains(meal)) {
            
        } else {

            this.meals.add(meal);
        }

    }
     public void printMeals() {
         
         for (String i : meals){
             System.out.println(i);
             
         }
     }
         public void clearMenu() {
             
         meals.clear();
     }
}
