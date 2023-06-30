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

    public static boolean check(String str) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == "(" ||
                    str.charAt(i) == "{" ||
                    str.charAt(i) == "[")
                list.add(str.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (str.charAt(i) == ")" && list.getLast().equals("("))
                    list.pollLast();
                else if (str.charAt(i) == "}" && list.getLast().equals("{"))
                    list.pollLast();
                else if (str.charAt(i) == "]" && list.getLast().equals("["))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }
}
