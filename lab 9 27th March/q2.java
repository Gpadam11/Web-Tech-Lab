//2.Write a program to perform following operations	on	user entered strings –
//i)Change the case of the string
//ii)Reverse the string
//iii)Compare two strings
//iv)Insert one string into another string

import java.util.*;
class q2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,str="", s1="";
        System.out.println("Enter a string");
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            if(ch1>=65 && ch1<=90)
            {
                ch1=(char)(ch1+32);
                str=str+ch1;
            }
            else if(ch1>=97 && ch1<=122)
            {
                ch1=(char)(ch1-32);
                str=str+ch1;
            }
            else
            {
                str=str+ch1;
            }
        }
        System.out.println("String after changing case: "+str);
        
        // System.out.println("Uppercase string: "+s.toUpperCase());
        // System.out.println("Lowercase string: "+s.toLowerCase());

        //reverse string
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            s1=ch+s1;
        }
        System.out.println("Reverse string: "+s1);
        System.out.println("Enter another string");
        String s2=sc.nextLine();

        //compare two string using compare
        if(s.compareTo(s2)==0)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        //Joins two strings
        s2=s+s2;
        System.out.println("Concatenated string: "+s2);
    }
}