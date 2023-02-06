//Program to check a user entered number is palindrome or not.

import java.util.*;

public class q3 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int num;
        System.out.println("Enter a no");
        num = ob.nextInt();
        int rev = 0, d, temp = num;
        while (temp != 0) {
            d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}