import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class Task2 {
    private static Logger logger = Logger.getLogger(Task2.class.getName());

    public static void main(String[] args) {
        int[] numbers = { 13, 2, 6, 4, 8, 3, 10 };
        System.out.println(Arrays.toString(numbers));
        bubbleSorting(numbers);
    }

    private static void bubbleSorting(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    logger.log(Level.INFO, String.format("%d <-> %d, %s",
                            numbers[j], numbers[j+1], Arrays.toString(numbers)));
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
