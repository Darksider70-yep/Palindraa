import java.util.*;

public class Palindraa {
    public static void main(String[] args) {
        System.out.println("#################\n Welcome\n   TO   \nPalindraa\n###################\nversion: 0.0.1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input TEXT:");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean ispalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                ispalindrome = false;
                break;  // optional optimization
            }
        }

        if (ispalindrome) {
            System.out.println("The text is a palindrome");
        } else {
            System.out.println("The text is not a palindrome");
        }

        sc.close();
    }
}