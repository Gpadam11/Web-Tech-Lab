//Program to print the corresponding grade for the given mark using if..else statement in Java

import java.util.*;
class q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter marks");
        m=sc.nextInt();
        if(m>=90)
        System.out.println("Grade: O");
        else if(m>=80 && m<90)
        System.out.println("Grade: E");
        else if(m>=70 && m<80)
        System.out.println("Grade: A");
        else if(m>=60 && m<70)
        System.out.println("Grade: B");
        else if(m>=50 && m<60)
        System.out.println("Grade: C");
        else if(m>=40 && m<50)
        System.out.println("Grade: D");
        else
        System.out.println("Grade: F");
    }
}