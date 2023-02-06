//Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name.

import java.util.Scanner;
class q4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fname, lname;
        System.out.println("Enter First name");
        fname=sc.next();
        System.out.println("Enter Last name");
        lname=sc.next();
        System.out.println("Name: "+lname+" "+fname);
    }
}