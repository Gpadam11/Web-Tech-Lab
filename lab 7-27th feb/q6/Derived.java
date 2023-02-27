class Derived extends Base{
    int c;
    Derived(int a, int b, int c)
    {
        super(a, b);
        this.c=c;
    }
    void disp()
    {
        super.disp();
        System.out.println("c: "+c);
    }
}