import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "jorum");
        hashMap.put(2, "ronnie");
        hashMap.put(3, "elchapo");

        System.out.println("Value for key 2: " + hashMap.get(2)); 

        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}

