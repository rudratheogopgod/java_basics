import java.util.Scanner;//importing scanner class

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int length = 0;
        int n = sc.nextInt();
        int original_Num = n;
        while(n != 0){
            length++;//the length of digits increases with each iteration
            n /= 10;//cuts the last digit of the number with each iteration
        }
        System.out.println("The number of digits in "+ original_Num+" is "+length);
    }
}
