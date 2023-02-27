//6.Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super.

class Base{
    int a, b;
    Base(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void disp()
    {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
