import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int acc_no, balance;
        String name, aadhar_no;
        //for 5 persons
        for(int i=0; i<2; i++)
        {
            System.out.println("Enter details of person "+(i+1));
            System.out.println("Enter account number: ");
            acc_no=sc.nextInt();
            System.out.println("Enter balance: ");
            balance=sc.nextInt();
            System.out.println("Enter name: ");
            name=sc.next();
            System.out.println("Enter aadhar number: ");
            aadhar_no=sc.next();
            Person p=new Person(acc_no, balance, name, aadhar_no);
            p.acc_no=acc_no;
            p.balance=balance;
            p.name=name;
            p.aadhar_no=aadhar_no;
            p.disp();
        }
    }
}