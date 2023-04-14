import java.util.Scanner;
public class SimpleInterest{
    public static void main(String args[]){

     //Take input from the user
        //Create an instance of Scanner class
    Scanner sc = new Scanner(System.in);    
    //Declare variables
    float p,r,t,si;
    System.out.print("Enter the Principal =");
    p = sc.nextFloat();     //Initialize the variables

    System.out.print("Rate =");
    r = sc.nextFloat();           //Initialize the variables

    System.out.print("Time =");
    t = sc.nextFloat();       //Initialize the variables
    
   si = (p*r*t)/100;
  System.out.print("Simple Interest is =" +si);
}
}