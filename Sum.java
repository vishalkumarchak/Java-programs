import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number: ");
        int a = sc.nextInt();
        System.out.print("please enter your second number: ");
        int b= sc.nextInt();
        int c = a+b;
        System.out.println("the sum of two numbers is:"+c);
    }
}