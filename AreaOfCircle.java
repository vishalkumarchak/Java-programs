import java.util.Scanner;
public class AreaOfCircle {
     
     public static void main(String args[]) {
        double radius;
        double area;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of circle =");
       radius = sc.nextInt();
        
         area = 3.14 *radius * radius;
        System.out.println("Area = " + area);
    }
}
