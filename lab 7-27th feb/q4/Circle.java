class Circle extends Shape{
    double r;
    Circle(double radius){
        r=radius;
    }
    void showArea(){
        area=3.14*r*r;
        System.out.println("Area of circle: "+area);
    }
}