package Set2_solutions;

import java.util.Arrays;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows : ");
        int r  = sc.nextInt();
        System.out.println("enter no of columns : ");
        int c = sc.nextInt();
        int arr[] = new int[r*c];
        System.out.println("Enter 1-d array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        arr = twoDArray(arr,r,c);
        System.out.println("2-D Array :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[j+(i*c)]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static int[] twoDArray(int[] arr, int r, int c) {

        // k = j + (i * total no of columns) -------------> for row wise order  
        // k = j + (i * total no of rows in ) -------------> for column wise order

        int arr2[][] = new int[r][c];
        int len = 0,k=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j]  = arr[len++];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                k=j + (i*c);
                arr[k++] = arr2[i][j];
            }
        }
        return arr;
    }
}
