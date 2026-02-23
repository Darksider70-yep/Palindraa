import java.util.*;
public class Palindraa {
    public static void main (String[] args){
    System.out.println("#################\n Welcome\n   TO   \nPalindraa\n###################\nversion: 0.0.1");
    Scanner sc = new Scanner(System.in);
    System.out.println("Input TEXT:");
    String input= sc.nextLine();
    int n = input.length();
    String st="";
    for(int i=n-1;i>=0;i--){
        st=st+input.charAt(i);
    }
    if(input.equals(st)){
        System.out.println("The text is palindrome");
    }
    else{
        System.out.println("The text is not a palindrome");
    }
    }
}