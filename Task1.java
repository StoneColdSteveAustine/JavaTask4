import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов ");
        int num = scanner.nextInt();
        scanner.close();
        Deque<Integer> Deque = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            Deque.add(i);
        }
        System.out.println(Deque);

        System.out.println("Перевёрнутый список");
        while (Deque.size() > 0) {
            System.out.print(Deque.pollLast() + " ");
        }
    }
}
