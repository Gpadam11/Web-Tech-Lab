//1.Illustrate the usage of abstract class with following Java classes –
//i)An abstract class „student‟ with data member roll no, reg no and a abstract method course()
//ii)A subclass „kiitian‟ with course() method implementation

import java.util.Scanner;
abstract class student
{
    int rollno;
    int regno;
    abstract void course();
}
class kiitian extends student
{
    void course()
    {
        System.out.println("B.Tech");
    }
}
class q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        student obj = new kiitian();
        obj.course();
    }
}