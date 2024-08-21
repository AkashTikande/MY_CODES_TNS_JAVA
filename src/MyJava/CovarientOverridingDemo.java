package src.MyJava;

import java.sql.SQLOutput;

public class CovarientOverridingDemo {
    public static void main(String[] args) {
        Color c = new Color();
        System.out.println(c.getColor());

        Red r = new Red();
        System.out.println(r);
    }
}
