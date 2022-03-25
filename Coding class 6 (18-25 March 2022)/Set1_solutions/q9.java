import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter a no of rows :");
        r = sc.nextInt();
        System.out.println("Enter a no of columns :");
        c = sc.nextInt();

        int r_sum[] = new int[r];
        int c_sum[] = new int[c];
        int matrix[][] = new int[r][c];
        System.out.println("Enter matrix element : ");
        for(int i = 0 ; i < r ; i++){
            r_sum[i] = 0;
            for(int j = 0 ; j < c ; j++){
                matrix[i][j]=sc.nextInt();
                r_sum[i]+=matrix[i][j];
                c_sum[j]+=matrix[i][j];
            }
        }
        System.out.println("Entered Matrix : ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0 ; i<r;i++){
            System.out.println("Sum of row "+(i+1)+" => "+r_sum[i]);
        }
        for(int i = 0 ; i<c;i++){
            System.out.println("Sum of column "+(i+1)+" => "+c_sum[i]);
        }
        sc.close();
    }
}
