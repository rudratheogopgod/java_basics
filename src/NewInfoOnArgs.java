public class NewInfoOnArgs {
    public static void main(String[] args) {
        // args take command line arguments a strings thus, concatenation happens
        System.out.println(args[0]+ args[1]);
        // Convert command-line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform arithmetic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Division: " + (num1 / num2));

    }
}
