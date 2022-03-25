import java.util.Scanner;

public class q1 {
    public static int findMax(int a , int b) {
        int m = 0;
        if(a>0 && b>0){
            while(a>0 || b>0){
                --a;
                --b;
                m++;
            }
        }else if (a>0 && b<0){
            m = a;
        }else if(a<0 && b>0){
            m = b;
        }else{
            while(a<0 && b<0){
                ++a;
                ++b;
                m++;
            }
        }
        return m;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        int max = findMax(a,b);
        if (a>0 || b>0){
            System.out.println("Greater between "+a+" and "+b+" is "+max);
        }else{
            System.out.println("Greater between "+a+" and "+b+" is "+-max);
        }

        sc.close();
    }
}
