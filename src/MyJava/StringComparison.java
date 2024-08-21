package src.MyJava;

import java.sql.SQLOutput;

public class StringComparison {
    public static void main(String[] args) {

        String s1 = "TNSIF";
        String s2 = "TNSIF";

        //Creating new operator heap memory

        String s3 = new String("TNSIF");
        String s4 = new String("TNSIF");

        // == $ equals
        // ==-> object references
        // equals --> data
        System.out.println("Case 1:" + (s1 == s2));
        System.out.println("Case 2:" + (s1 == s3));
        System.out.println("Case 3:" + s2.equals(s1));
        System.out.println("Case 4" + (s2.equals(s4)));
        System.out.println("Case 5:" + s3==(s4));
        System.out.println("Case 6:" + s4.hashCode());


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());


        System.out.println(s1.compareTo(s4));

        System.out.println(s1.compareTo("TNSIF"));

        System.out.println(s1.compareToIgnoreCase("TNSIF"));


    }
}

