
class rectangle extends Shape{
    double l, b;
    rectangle(double length, double breadth){
        l=length;
        b=breadth;
    }
    void showArea(){
        area=l*b;
        System.out.println("Area of rectangle: "+area);
    }
}
