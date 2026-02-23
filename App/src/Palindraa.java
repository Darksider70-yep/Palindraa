import java.util.*;
public class Palindraa {
    public static void main (String[] args){
    System.out.println("#################\n Welcome\n   TO   \nPalindraa\n###################\nversion: 0.0.1");
    Scanner sc = new Scanner(System.in);
    System.out.println("Input TEXT:");
    String input= sc.nextLine();
    int n = input.length();
    char[] chars = input.toCharArray();
    int start = 0;
    int end = n - 1;
    boolean ispalindrome = true;
    while(start < end){
        if(chars[start] != chars[end]){
            ispalindrome = false;
            break;  }
        start++;
        end--;
    }
    if(ispalindrome){
        System.out.println("The text is a palindrome");
    }else{
        System.out.println("The text is not a palindrome");}
    }
}