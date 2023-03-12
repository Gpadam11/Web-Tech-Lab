abstract class base
{
    abstract void display();
}
class derived extends base
{
    void display()
    {
        System.out.println("Inside derived class");
    }
}
class derived2 extends derived{
    void display()
    {
        System.out.println("Inside derived2 class");
    }
}
class abstractmethod
{
    public static void main(String[] args) {
        base ob1=new derived();
        derived ob2=new derived2();
        ob1.display();
        ob2.display();
    }
}