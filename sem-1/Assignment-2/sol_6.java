import java.util.*;
public class sol_6 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double w , h , bmi ;
    System.out.println("Enter weight in pounds  : ");
    w = sc.nextDouble();
    System.out.println("Enter height in inches  : ");
    h = sc.nextDouble();
    bmi = (w*0.45359237)/Math.pow((h*0.0254),2) ;
    System.out.println("Body Mass Index  : "+bmi);
  }
}
