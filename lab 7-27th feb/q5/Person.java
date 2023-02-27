class Person extends Account{
    String name, aadhar_no;
    Person(int acc_no, int balance, String name, String aadhar_no)
    {
        super(acc_no, balance);
        name="";
        aadhar_no="";
    }
    void disp()
    {
        super.disp();
        System.out.println("Name: "+name);
        System.out.println("Aadhar number: "+aadhar_no);
    }
}