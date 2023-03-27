//2.Define an interface Motor with a data member –capacity and two methods such as run() and consume(). Define a Java class 'Washing machine' which implements this interface and write the code to check the value of the interface data member thru an object of the class.

interface Motor{
    public int capacity = 100;
    void run();
    void consume();
}

class washing_machine implements Motor{
    public void run(){
        System.out.println("Washing machine is running");
    }
    public void consume(){
        System.out.println("Washing machine is consuming");
    }
    public static void main(String[] args) {
        washing_machine obj = new washing_machine();
        obj.run();
        obj.consume();
        System.out.println("Capacity of washing machine is: "+capacity);
    }
}