import java.util.*;
class commandlineprime {
    public static void main(String[] args) 
    {
     if(args.length>0 && args.length<=5)
     {
        int i, j, n, c=0, count=0;
        for(i=0;i<5;i++)
        {
            n=Integer.parseInt(args[i]);
            for(j=1;j<=n;j++)
            {
                if(n%j==0)
                c++;
            }
            if(c==2){
            System.out.println("Number "+n+" is prime");
            count++;}
            else{
            System.out.println("Number "+n+" is not prime");}
            c=0;
        }
        System.out.println("Number of prime nos are "+ count);
      }
      else
      System.out.println("No args");
    }
}
