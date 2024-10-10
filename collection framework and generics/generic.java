public class generic {

    
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
    
        Integer[] intArray = {10, 20, 30, 40};
        System.out.println("Number Array:");
        printArray(intArray);

        // String array
        String[] strArray = {"jorum", "ronnie", "elchapo"};
        System.out.println("\nNames Array:");
        printArray(strArray);
    }
}

