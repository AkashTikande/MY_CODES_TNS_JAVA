package src.MyJava;

import java.sql.SQLOutput;

public class StringOperationDemo {
    public static void main(String[] args) {
        String s1 =new String (" INDIAN ");
        System.out.println(s1);
        String s2 = s1.toUpperCase();
        System.out.println(s1.length());
        int a =s2.length();
        System.out.println("Length is: "+ a);
        String s3 = s1.substring(1,7);

        System.out.println(s3);
        System.out.println(s1.trim()); // remove all the spaces:
        System.out.println(s1.stripTrailing());
        System.out.println(s1.isEmpty());

        s1="Good Morning Students:";
        s2= new String(s1);


        System.out.println("Case 1:"+s1.equals(s2));
        System.out.println("Case 2:"+s2==(s1));



    }
}
