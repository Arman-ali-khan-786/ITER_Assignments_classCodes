import java.util.Scanner;

public class sol_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(0 - Scissor , 1 - Rock & 2 - paper)\nEnter your number : ");
        int n = sc.nextInt();
        int ran = (int)(Math.random()*((2-0)+1)+0);
        System.out.println();
        System.out.println("You : "+n); 
        if (n==1 || n==2 || n==0){
            System.out.println("Computer : "+ran);
            System.out.println();
            if (n==0){
                if (ran==0){
                    System.out.println("Computer is Scissor & you are also Scissor ,it's a draw.");
                }
                else if(ran==1){
                    System.out.println("Computer is Rock & you are  Scissor , you lose.");
                }
                else{
                    System.out.println("Computer is paper & you are Scissor , you won.");
                }
            }
            else if (n==1){
                if (ran==0){
                    System.out.println("Computer is Scissor & you are rock , you won.");
                }
                else if(ran==1){
                    System.out.println("Computer is Rock & you are also rock , it's a draw.");
                }
                else{
                    System.out.println("Computer is paper & you are rock , you lose.");
                }
            }
            else {
                if (ran==0){
                    System.out.println("Computer is Scissor & you are paper , you lose.");
                }
                else if(ran==1){
                    System.out.println("Computer is Rock & you are paper , you won.");
                }
                else{
                    System.out.println("Computer is paper & you are also paper , it's a draw.");
                }
            }

        }else{
            System.out.println("enter a valid number form 0,1,2");
        }
        sc.close();
    }
}
