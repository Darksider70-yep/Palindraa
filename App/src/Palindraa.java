import java.util.*;
public class Palindraa {
    public static void main (String[] args){
        System.out.println("#################\n Welcome\n   TO   \nPalindraa\n###################\nversion: 0.0.1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input TEXT:");
        String input= sc.nextLine();
        Stack<Character>stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        boolean ispalindrome = true;
        for ( char c : input.toCharArray()){
            if(stack.pop() != c){
                ispalindrome = false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println("The text is a palindrome");
        }else{
            System.out.println("The text is not a palindrome");
        }
    }
}