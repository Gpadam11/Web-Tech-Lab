class q{
    public static void main(int x){
        System.out.println("one argu");
    }
    public static void main(int x, int y) {
        System.out.println("two int argu");
    }
    public static void main(boolean x) {
        System.out.println("bool argu");
    }
    public static void main(String T[]) {
        main(1);
        main(2,3);
        main(false);
    }
    
}