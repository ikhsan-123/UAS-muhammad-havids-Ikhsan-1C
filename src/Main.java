import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("BMW", "Audi", "Toyota", "Porsche", "Nissan"));
        getNameInPrima(cars);
    }
    public static void getNameInPrima(ArrayList<String> p) {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        boolean[] condition = new boolean[p.size()];

        for (int i = 0; i < p.size(); i++) {
            int count = 0;
            for (char c : p.get(i).toCharArray()) {
                count += Character.getNumericValue(c);
            }
            boolean isPrime = false;
            for (int j : primeNumbers) {
                if (count == j) {
                    isPrime = true;
                    break;
                }
            }
            condition[i] = isPrime;
        }
        for (int i = 0; i < condition.length; i++) {
            System.out.println("Merk: " + p.get(i) + ", Prime Name: " + condition[i]);
        }
    }
}