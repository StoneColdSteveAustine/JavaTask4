import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобки");
        String text_1 = scanner.nextLine();
        scanner.close();
        System.out.println(check(text_1));
    }

    public static boolean check(String s) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == "(" ||
                    s.charAt(i) == "{" ||
                    s.charAt(i) == "[")
                list.add(s.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (s.charAt(i) == ")" && list.getLast().equals("("))
                    list.pollLast();
                else if (s.charAt(i) == "}" && list.getLast().equals("{"))
                    list.pollLast();
                else if (s.charAt(i) == "]" && list.getLast().equals("["))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
