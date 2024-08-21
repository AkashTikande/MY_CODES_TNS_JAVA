package src.MyJava;

public class SampleStringDemo {
    public static void main(String[] args) {
        char c[] ={'a', 'b', 'c', 'd', 'e'};
        String s1 =new String(c);
        String s2 =new String("Akash");
        String s3 =new String(" s1");
        System.out.println(s1);
        System.out.println(s2);
        //CONCAT-NATION OPERATION
        String longStr="This is to show"+"How long sentence"+"Can be printed";
        System.out.println(longStr);
    }
}
