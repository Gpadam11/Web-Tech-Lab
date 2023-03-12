//WAP to create a class complex having data members real and imaginary and member function add(complex c2) used to add two complex nos and display method to display the result. 

import java.util.*;
class complex
{
    int real,imag;
    void add(complex c2)
    {
        real=real+c2.real;
        imag=imag+c2.imag;
    }
    void display()
    {
        System.out.println("The sum is "+real+"+"+imag+"i");
    }
    public static void main(String args[])
    {
        complex c1=new complex();
        complex c2=new complex();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of first complex no.");
        c1.real=sc.nextInt();
        c1.imag=sc.nextInt();
        System.out.prientln("Enter the real and imaginary part of second complex no.");
        c2.real=sc.nextInt();
        c2.imag=sc.nextInt();
        c1.add(c2);
        c1.display();
    }
}