import java.util.*;

class readPrintIntValue {
    public static void main(String[] args) {
        
        System.out.print("Enter the integer: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println("Entered integer is: " + x);
    }
}
