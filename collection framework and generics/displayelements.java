import java.util.ArrayList;

public class displayelements {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        System.out.println("Elements in ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

