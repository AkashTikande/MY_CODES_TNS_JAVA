import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum += i;
        }
        System.out.println("Sum="+sum);
    }
}
// Create the repository into the git_Hub
// create the clone of the repository // do it. // optional
//copy th code URL from git_Hub and paste it into the manage remotes
//pull master branch of git_Hub into the intellij