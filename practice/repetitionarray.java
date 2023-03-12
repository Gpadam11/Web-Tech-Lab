//WAP to input 10 integers in an array and the output will be array of numbers excluding the repeted ones

import java.util.*;
class repetitionarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b[]=new int[10];
        for(int i=0;i<10;i++)
        {
            int c=0;
            for(int j=0;j<10;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                b[i]=arr[i];
            }
        }
        for(int i=0;i<10;i++)
        {
            if(b[i]!=0)
            {
                System.out.print(b[i]+" ");
            }
        }
    }
}