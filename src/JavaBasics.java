import java.sql.SQLOutput;

public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Start JavaBasics");
        int num =20;


        String studentName = "Student";
        System.out.println("My Class Student" + studentName);
        int value1 = 19/2;
        float value2 = 10.50f;
        double value3 = 30d/2d;
        float value4 = 75;
        System.out.println(num*3);
        System.out.println("Value1:"+ value1);
        System.out.println("Value2:"+ value2);
        System.out.println("Value3:"+ value3);
        System.out.println("Value4:"+ value4);

        int marks =600;
        // assigning expression to the variable
        double percentage = marks * 0.46f;
        System.out.println("Percentage is: " + percentage);
        int side =2;
        int Area = side*side;
        System.out.println("Area of squre is:"+Area);

        char ch1 = 65;
        System.out.println(" Ascii value of char1 is:"+ch1);

        int a ='A';
        System.out.println("Number for Ascii value is :"+a);

        short shortMax = 3268;
        short shortMin = -3268;
        System.out.println("Minimum range of ShortMin is:" + shortMin);
        System.out.println("Maximum range of ShortMan is:" + shortMax);

        long longMax = 9223372036854775807L;
        long longMin = -9223372036854775807L;

        System.out.println("Maximum renge of Long  is : "+ longMax);
        System.out.println("Minimum renge of Long  is : "+ longMin);

        float f = 22.22f;
        double d =f;
        System.out.println(d);

        char ch ='A';
        int i3 =ch;
        System.out.println(i3);

        char var1 ='\u007A';
        int i4 = var1;
        System.out.println(i4);

        //narrowing //expliciting type casting;

        double f1 =10.52d;
        long l = (long) f1;
        System.out.println(l);

        long l1 = 9123372036854775061l;  // 19 digits for long
        int i2 =(int)11;
        System.out.println(i2);


        byte b1 =90;
        char ch2 = (char) b1;
        System.out.println(ch2);

        //




    }
}

//dataTypes = primitive - ( fixed memory length ) Not Primitive - (variable memory length )
//primitive - char int flow double float long shot byte;
//Nan primitive -
//numerical - byte short int long - without decimal point, = based on the renge
// 1 byte 8 bits
// shor 2 bytes = 16 bits
// long 8 bytes
// float 4 byte
// double 16 byte
// char 2 byte
// boolean - True False = 1 bit memory allocation

// string Concat_Nation.