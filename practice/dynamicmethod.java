 class A {
void disp()
{
    System.out.println("inside A class");
}    
}
class B extends A
{
    void disp()
    {
        System.out.println("inside B class");
    }
}
class C extends A
{
    void disp()
    {
        System.out.println("inside C class");
    }
    void print()
    {
        System.out.println("inside print");
    }
}
class dynamicmethod
{
    public static void main(String args[])
    {
        A d1=new A();
        B d2=new B();
        C d3=new C();
        A ref;
        ref=d1;
        ref.disp();
        ref=d2;
        ref.disp();
        ref=d3;
        ref.disp();
        d3.print();
        // ref.print();//error
    }
}