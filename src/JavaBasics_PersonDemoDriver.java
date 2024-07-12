import java.util.Scanner;
public class JavaBasics_PersonDemoDriver {
    public class JavaBasics_Person
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String Name;
            Name =sc.next();
            System.out.println("Enter Age");
            int age = sc.nextInt();
            System.out.println("Enter Gender");
            String Gender = sc.next();
            System.out.println("Enter Income");
            int income = sc.nextInt();

            JavaBasics_Person person = new JavaBasics_Person();
            JavaBasics_Person.newName(Name);
            JavaBasics_Person.setIncome(income);
            JavaBasics_Person.setGender(Gender);
            JavaBasics_Person.setAge(age);

        }
    }
}
