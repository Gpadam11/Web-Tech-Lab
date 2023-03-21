//7.Write a program in Java to define a class Number with appropriate data members and member functions to input n number of integers and swap the biggest and smallest elements. Use member functions read(), swap() and display().

import java.util.*;
class Number{
    int n; 
    int arr[]=new int[100];
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void swap(){
        int max=arr[0], min=arr[0], maxpos=0, minpos=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxpos=i;
            }
            if(arr[i]<min)
            {
                min=arr[i];
                minpos=i;
            }
        }
        int temp=arr[maxpos];
        arr[maxpos]=arr[minpos];
        arr[minpos]=temp;
    }

    void display()
    {
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
    }

    public static void main(String args[])
    {
        Number obj=new Number();
        obj.read();
        obj.swap();
        obj.display();
    }
}
