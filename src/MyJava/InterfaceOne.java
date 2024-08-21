package src.MyJava;

public interface InterfaceOne {
    void show();   // functional interface - having only one abstract method:
}
interface ExtendInterfaceOne extends InterfaceOne
{
    //void (); - NORMAL INTERFACE
    public void print();


}
interface Demo extends InterfaceOne
{
    void print();
}