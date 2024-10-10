import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("jorum");
        arrayList.add("ronnie");
        arrayList.add("elchapo");

        
        System.out.println("Element at index 1: " + arrayList.get(1)); 
        arrayList.remove(2); 

        System.out.println("ArrayList Elements: " + arrayList);
    }
}