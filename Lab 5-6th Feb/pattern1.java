// A 
// A B     
// A B C   
// A B C D
 
public class pattern1
{
    public static void main(String[] args)
    {   
        int alphabet = 65;
        
        for (int i=0; i< 4; i++)
        {
            for (int j=0; j<=i; j++)
            {
                 System.out.print((char) (alphabet+j) + " ");
            }
            System.out.println();
        }
    }
}
