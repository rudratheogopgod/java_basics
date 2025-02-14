import java.util.Scanner;//importing scanner class
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int sum = 0;//sum initialized as 0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){//for loop to iterate to n natural numbers
            sum += i;//i is added
        }
        System.out.println(sum);
    }
}
