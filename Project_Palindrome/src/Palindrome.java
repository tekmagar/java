import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
        {
            builder.append(s.charAt(i));
        }
        return builder.toString().equals(s);
    }

    public static void main(String args[]) {
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();   //Input the string
        //Check whether palindrome or not
        if (isPalindrome(str))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}

