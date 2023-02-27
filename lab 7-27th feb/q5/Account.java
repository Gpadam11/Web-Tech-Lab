//5.Write a program to create an Account class containing acc_no, balance as data members and disp() to display the details. Inherit it in Person class with all mentioned data members and functions. Person class also has name and aadhar_no as extra data members of its own. Override disp() function. Create 5 persons details.

class Account{
    int acc_no, balance;
    Account(int acc_no, int balance )
    {
        acc_no=0;
        balance=0;
    }
    void disp()
    {
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}



