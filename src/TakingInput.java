//Here I learnt how to take input using the scanner class
import java.util.Scanner;
//Importing java library in which util package
public class TakingInput {
    public static void main(String[] args){
        System.out.print("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Hi "+name+ "\n"+"""
                Would you like some coffee""");
    }
}
