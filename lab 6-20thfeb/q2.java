//2.Accept 10 numbers from command line and check how many of them are even and how many odd.
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        if(args.length>0 && args.length<=10)
        {
          int count=0,i,n, c=0;
          for(i=0; i<10;i++)
          {
              n=Integer.parseInt(args[i]); 
                if(n%2==0)
                {
                    count++;
                }
                else
                {
                    c++;
                }
}
System.out.println("No. of even numbers are: "+count);
System.out.println("No. of odd numbers are: "+c);
}
else
{
    System.out.println("Wrong choice");
}
}
}
