//fibonacci series
import java.util.*;
class fibonacci
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
int a=0,b=1,c=0, i,n;
System.out.println("Fibonacci series");
System.out.println("Enter range of series");
n=sc.nextInt();
System.out.print(a+" ");
System.out.print(b);
for(i = 1; i <= n-2; i++) {
    c = a + b;
    System.out.print(" ");
    System.out.print(c);
    a = b;
    b = c;
}
}
}

