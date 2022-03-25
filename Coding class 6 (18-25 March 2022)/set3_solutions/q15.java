package Set3_solutions;
public class q15 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            for (int j = 5 ; j>i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1 ; k <i; k++) {
                System.out.print(k); 
            }
            for(int m = i ; m >0 ; m--){
                System.out.print(m); 
            }
            System.out.println();
        }

        for (int i = 5; i>=1; i--) {
            for (int j = 5 ; j>=i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1 ; k < i ; k++) {
                System.out.print(k); 
            }
            for(int m = i-2 ; m>=1 ; m--){
                System.out.print(m); 
            }
            System.out.println();
        }
    }
}
