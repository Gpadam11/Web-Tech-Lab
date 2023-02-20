//4.Program to find no. of objects created out of a class using 'static' modifier.

class q4
{
    static int count=0;
    q4()
    {
        count++;
    }
    public static void main(String args[])
    {
        q4 obj1=new q4();
        q4 obj2=new q4();
        q4 obj3=new q4();
        System.out.println("No. of objects created: "+count);
    }
}