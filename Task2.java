// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {

        int first = 1;
        int last = 1000;
        if (first == 1) {
            System.out.print(first + " ");
        }
        for (int i = first; i < last; i++) {
            int counter = 0;
            for (int j = first; j < i / 2; j++) {
                if (i % j == 0) counter++;          
            }

            if (counter == first) System.out.print(i + "  ");
        }
    }
}