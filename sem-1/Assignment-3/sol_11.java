import java.util.*;
public class sol_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kilograms : "); double w = sc.nextDouble();
        System.out.println("Enter height in metres"); double h = sc.nextDouble();
        double bmi = w/(h*h);
        if ( bmi < 18.5){
            System.out.println("Under Weight");
        }
        else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal Weight");
        }
        else if(bmi>=25 && bmi<=29.9){
            System.out.println("Over Weight");
        }
        else{
            System.out.println("Obese");
        }
        sc.close();
    }
}
