import java.util.*;
class prime
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
int i,n,c=0;
System.out.println("Enter a no");
n=sc.nextInt();
// check if the no is prime no
for(i=2;i<n;i++)
{
    if(n%i==0)
    {
        c++;

    }
}
if(c==0)
{
    System.out.println("Prime no");
}
else
{
    System.out.println("Not a prime no");

}
}
}


