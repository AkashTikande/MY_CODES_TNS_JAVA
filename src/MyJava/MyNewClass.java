package src.MyJava;

import java.util.Arrays;

// Array - storing of data by using datatypes
public class MyNewClass {
    public static void main(String[] args) {
        System.out.println("MyNewClass");
        System.out.println(" single and multi dimensional Array");
        int intArr[]={2,4,5,12,34,54,67,67};
        System.out.println(Arrays.toString(intArr));
        for(int i=0;i<intArr.length;i++)
        {
            System.out.println(intArr[i]+"");
        }
        System.out.println();
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        System.out.println(Arrays.toString(intArr));

        System.out.println(Arrays.toString(intArr));

        int intArr2[]=(Arrays.copyOf(intArr,2));
        System.out.println(Arrays.toString(intArr2));



    }
}
