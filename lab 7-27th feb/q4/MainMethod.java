import java.util.*;
class MainMethod{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double r=sc.nextDouble();
        Circle c=new Circle(r);
        c.showArea();
        System.out.println("Enter length and breadth of rectangle: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        rectangle r1=new rectangle(l, b);
        r1.showArea();
    }
}