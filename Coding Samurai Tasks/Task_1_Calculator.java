import java.util.Scanner;

public class Task_1_Calculator {

    public static int add(int a, int b) {
        
        return a + b;
    }
    public static float sub(float a, float b) {
        return a - b;
    }
    public static float mul(float a, float b) {
        return a * b;
    }
    public static float div(float a, float b) {
        return a / b;
    }
    public static float remainder(float a, float b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println("Enter Two Number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        float a = sc.nextFloat();
        System.out.println("Enter Second Number : ");
        float b = sc.nextFloat();
        System.out.println("Press + for Addition");
        System.out.println("Press - to Substraction");
        System.out.println("Press * for Multiplication");
        System.out.println("Press / for division");
        System.out.println("Press % for Remainder");
        System.out.println();
        System.out.println("Enter your choice : ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            // case to add two numbers
            case '+':
                add(a, b);
                break;
    
            // case to subtract two numbers
            case '-':
                sub(a, b);
                break;
    
            // case to multiply two numbers
            case '*':
                mul(a, b);
                break;
    
            // case to divide two numbers
            case '/':
                div(a, b);
                break;
            case '%':
                remainder(a, b);
                break;    
    
            default:
                System.out.println("You enter wrong input");
            }
    }
}




