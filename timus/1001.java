package lr7.timus;

import java.io.*;
import java.util.*;

class SquareRootCalculator {

    // Метод для вычисления квадратных корней
    public static void calculateSquareRoots(InputStream inputStream) throws IOException {
        // Чтение входных данных
        Scanner scanner = new Scanner(inputStream);
        List<Long> numbers = new ArrayList<>();

        // Считываем все числа и сохраняем их в список
        while (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong());
        }

        // Выводим квадратные корни чисел в обратном порядке
        for (int i = numbers.size() - 1; i >= 0; i--) {
            double sqrt = Math.sqrt(numbers.get(i));
            System.out.printf("%.4f\n", sqrt);
        }
    }
}