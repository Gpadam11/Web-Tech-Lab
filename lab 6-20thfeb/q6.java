//6.Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrixes in Java.

import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[3][3];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum1=0,sum2=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    sum1=sum1+arr[i][j];
                }
                if(i+j==2)
                {
                    sum2=sum2+arr[i][j];
                }
            }
        }
        System.out.println("The sum of left diagonal elements is: "+sum1);
        System.out.println("The sum of right diagonal elements is: "+sum2);
    }
}
