public class JavaBasics_Nested_If_Else {
    public static void main(String[] args) {
        int a=10,b=20,c=5;
        System.out.println("The Largest Number is:");
        if(a>b)
        {
            if(a<c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }

        }
        else {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
    }
}
