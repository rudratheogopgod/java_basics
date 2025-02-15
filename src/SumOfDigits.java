import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int sum = 0;
        int n = sc.nextInt();
        int original_Num = n;
        while(n != 0){
            sum += n%10;// add the last digit of n to sum
            n /= 10;//cuts the last digit of the number with each iteration
        }
        System.out.println("The sum of digits of "+ original_Num+" is "+sum);
    }
}
