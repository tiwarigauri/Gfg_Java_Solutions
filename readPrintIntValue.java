import java.util.*;

class readPrintIntValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the integer: " + x);
        sc.close();
        System.out.println("Entered integer is: " + x);
    }
}