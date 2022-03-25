package Set2_solutions;

public class q12 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int s = 5; s >i ; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int k = i-1; k >0 ; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
