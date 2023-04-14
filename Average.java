import java.util.Scanner;
public class Average {
       public static void main(String args[]) {

     double math, physics, chemistry, english, hindi, avarage;
     Scanner sc = new Scanner(System.in);

     System.out.print("math :");
      math = sc.nextDouble();

      System.out.print("Physics : ");
      physics = sc.nextDouble();

      System.out.print("Chemistry : ");
      chemistry = sc.nextDouble();

      System.out.print("English : ");
       english = sc.nextDouble();

        System.out.print("Hindi : ");
       hindi = sc.nextDouble();

       avarage =  (math+physics+chemistry+english+hindi)/5;
        System.out.println("average is : " +avarage);
    }
}
 