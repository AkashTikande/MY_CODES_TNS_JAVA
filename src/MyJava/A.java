package src.MyJava;

import javax.lang.model.util.AbstractElementVisitor14;

public class A {
    A foo()
    {
        return this;
    }
    void print()
    {
        System.out.println("");
    }
    class A2 extends A
    {
        A foo()
        {
            return this;
        }
    }

}
