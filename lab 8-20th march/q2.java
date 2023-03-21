//A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. 
//The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. 
//Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
import java.util.Scanner;

class TwoDShape 
{
    double l;
    double w;

    TwoDShape(double l, double w) {
        this.l = l;
        this.w = w;
    }

    double calculateArea() {
        return l * w;
    }
}

class ThreeDShape extends TwoDShape
{
    double h;

    ThreeDShape(double l, double w, double h) {
        super(l, w);
        this.h = h;
    }

    double calculateVolume() {
        return l * w * h;
    }
}
class q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter l, w, and h (in feet) of the plastic: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        ThreeDShape plastic = new ThreeDShape(l, w, h);
        double area = plastic.calculateArea();
        double volume = plastic.calculateVolume();

        double sheetCost = area * 40;
        double boxCost = volume * 60;

        System.out.println("Cost of plastic sheet: Rs " + sheetCost);
        System.out.println("Cost of plastic box: Rs " + boxCost);

    }
}
