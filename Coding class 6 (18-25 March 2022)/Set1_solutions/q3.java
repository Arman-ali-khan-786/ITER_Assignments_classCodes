// Write a java program to remove duplicate element from a sorted array without using any 
//  other data structure including array.

import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int len = removeDuplicates(arr,n);
        System.out.println("Array with unique elements : ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static int removeDuplicates(int[] arr, int n) {
        // int arr2[] = new int[n+1];
        // int j = 0;
        // for (int i = 0; i < n-1; i++) {
        //     if(arr[i]!=arr[i+1]){
        //         arr2[j++] = arr[i];
        //     }
        // }
        // arr2[j++] = arr[n-1];
        // for (int i = 0; i < j; i++) {
        //     arr[i]= arr2[i];
        // }
        // return j;

        // or
        int j = 0;
        for (int i = 1; i < n; i++) {
            if(arr[i]!=arr[i-1]){
                arr[j++] = arr[i-1];

            }
        }
        arr[j++] = arr[n-1];
        return j;
    }
}
