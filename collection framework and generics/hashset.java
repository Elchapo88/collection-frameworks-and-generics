 import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("jorum");
        hashSet.add("ronnie");
        hashSet.add("elchapo"); 
      
        System.out.println("HashSet Elements: " + hashSet);

     
        if (hashSet.contains("ronnie")) {
            System.out.println("ronnie is present.");
        } else {
            System.out.println("ronnie is not present.");
        }
    }


 
    
}
