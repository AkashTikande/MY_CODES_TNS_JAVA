package src.MyJava;

public class MyClass
{
    private static int section;
    private static int srNo;
    static
    {
        System.out.println("---Within The Static--");
        srNo =100; //g
        // Globally declared Variable;
      //  MyClass() // i for cursor to change into,from insert;
        {
            System.out.println("--within default constructor--");
            srNo=1000;
            section++;
        }
  //      public static();
  //      return MyClass();
    }
  //  static void display();
    {
        System.out.println("--MyObj--");
        System.out.println(section);
    }
}

