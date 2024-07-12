import java.util.Scanner;
public class JavaBasic_Scanner_Class_Functions {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int x = Integer.parseInt(sc.next());
        private String name;
        private int income;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    private int age;
        private int tax;
        // use getter and setter method to access variable outside the class right click - generate getter and setter
        // obj.two string method is Another method;
    }
//next() : reads the single value from the input (stop and whitespace)
//nextLine : single line value from the input (stop at \n) : it provides the 6 digits blank space
//nexInt : read Integer value
//nextChar : read char value from the input
//nextByte : read byte value from the input
//nextShort : read short value from the input
