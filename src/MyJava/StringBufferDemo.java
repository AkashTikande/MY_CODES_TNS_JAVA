package src.MyJava;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Buffer="+buffer);
        System.out.println("Length="+ buffer.length());
        System.out.println("Capacity="+ buffer.capacity());

        String s;
        int a =42;
        buffer= new StringBuffer(40);
        // s=buffer.append("a=").append(a).append("!".toString()
        // System.out.println(s);

        buffer=new StringBuffer("I Java!");
        buffer.insert(2,"Like");
        System.out.println(buffer);

        buffer.delete(3,6);
        System.out.println(buffer);
        System.out.println(buffer.reverse());




    }
}
