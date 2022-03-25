import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String i = Integer.toString(n&1);
        if(i.equals("0")){
            System.out.println(n+" is even number");
        }else{
            System.out.println(n+" is odd number");
        }
        sc.close();
    }
}
