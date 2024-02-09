import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList = a resizable array. Elements can be added and removed after compilation
        // stroe reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Ham");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        // 2D arraysList
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("Zuchini");
        produceList.add("peppers");

        groceryList.add(bakeryList);
        groceryList.add(produceList);

        System.out.println(groceryList);

        for(ArrayList i : groceryList) {
            System.out.println(i);
        }

    }
}