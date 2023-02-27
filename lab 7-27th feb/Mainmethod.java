//2.Illustrate the execution of constructors in multi-level	inheritance with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)

class plate {
int l, b;
    plate(int length, int breadth)
    {
        l=length;
        b=breadth;
    }
}
class box extends plate{
    int h;
    box(int length, int breadth, int height)
    {
        super(length, breadth);
        h=height;
    }
}
class woodbox extends box
{
    int t;
    woodbox(int length, int breadth, int height, int thickness)
    {
        super(length, breadth, height);
        t=thickness;
    }
    public static void main(String[] args)
    {
        woodbox w=new woodbox(10, 20, 30, 40);
        System.out.println("Length: "+w.l);
        System.out.println("Breadth: "+w.b);
        System.out.println("Height: "+w.h);
        System.out.println("Thickness: "+w.t);
    }
}
class Mainmethod{
    public static void main(String[] args)
    {
        woodbox w=new woodbox(10, 20, 30, 40);
        System.out.println("Length: "+w.l);
        System.out.println("Breadth: "+w.b);
        System.out.println("Height: "+w.h);
        System.out.println("Thickness: "+w.t);
    }
}