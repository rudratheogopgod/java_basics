import java.util.Scanner;// Importing the scanner class

public class AgeGroup {
    public static void main(String[] args) {
        System.out.println("Enter Your Age:");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age <= 12){//if runs when condition is true
            System.out.println("Hello child, want a candy");
        } else if (age <= 19) {//else if runs when previous condition is false and current is true
            System.out.println("Hello new teen ager, want to study");
        }else{//else runs when nothing is true
            System.out.println("Hello Sir, what can i do for you");
        }
    }
}
