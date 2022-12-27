import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> fibonacciSequence = new ArrayList<>();
        int firstNumber = 0;
        int secondNumber = 1;
        fibonacciSequence.add(0, firstNumber);
        fibonacciSequence.add(1, secondNumber);
        for (int i = 1; i <= 20; i++) {
            int nextNumber = fibonacciSequence.get(i) + fibonacciSequence.get(i - 1);
            fibonacciSequence.add(nextNumber);
        }
        System.out.println(Arrays.toString(fibonacciSequence.toArray()));
    }
}