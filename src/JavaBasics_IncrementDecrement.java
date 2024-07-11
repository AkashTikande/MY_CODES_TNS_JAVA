//java operators operations
public class JavaBasics_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("Incremet and Decrement operations");
        int a = 10;
        int b=20;
        int x =10;
        // int array[]={1, 2, 3, 4, 5, 6, 7,8,9,0};
        System.out.println("a and b value"+" before the  operations: "+a+" "+b);
        ++a;
        int c =++a +b +a--;
        System.out.println("C value after the operation is:"+c);

        int d = c++ +a +b--;
        System.out.println("d value after the operation is:"+d);

    }
}
