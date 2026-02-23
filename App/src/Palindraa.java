import java.util.*;
public class Palindraa {
    public static void main (String[] args){
    System.out.println("#################\n Welcome\n   TO   \nPalindraa\n###################\nversion: 0.0.1");
    Scanner sc = new Scanner(System.in);
    System.out.println("Input TEXT:");
    String input= sc.nextLine();
    int n = input.length();
    boolean flag = false;
    for(int i = 0; i < n/2; i++){
        if( input.charAt(i) != input.charAt(n-1-i)){
            break;
        }
        else {
            flag = true;
        }
    }
    if(flag){
        System.out.println("The text is a palindrome");
    } else {
        System.out.println("The text is not a palindrome");
    }
    }
}