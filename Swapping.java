import java.util.Scanner;
 public class Swapping {
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
     double x, y ;
     System.out.print("Enter value x : ");
     x = sc.nextDouble();
     
     System.out.print("Enter value y : ");
     y = sc.nextDouble();
    //swapping two variable
    x = x + y;
    y = x - y;
    x = x - y;

    
    System.out.println("After swapping:" + " x = " + x + ", y = " + y);
     
    }
 }