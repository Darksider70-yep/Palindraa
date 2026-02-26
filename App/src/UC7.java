import java.util.*;
public class UC7 {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version: 6.0");
        System.out.println("System initialized successfully");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = sc.next();
        Deque<Character> deque=new ArrayDeque<>();
        for(char c:input.toCharArray()){
            deque.add(c);
        }
        boolean isPalindrome=true;
        while(deque.size()>1){
            if(deque.removeFirst()!=deque.removeLast()){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is Palindrome?:"+isPalindrome);
    }
}