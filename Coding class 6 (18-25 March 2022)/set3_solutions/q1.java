package Set3_solutions;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Input Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Now ,Input element to be deleted :");
        int key = sc.nextInt();
        System.out.println();
        n = delEle(arr, key, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static int delEle(int[] arr, int key, int n) {
        int pos = binarySearch(arr, 0, n, key);
        if (pos == -1) {
            System.out.println("Entered key is not in the array. \n Therefore Array is same ;");
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return (n - 1);
    }

    private static int binarySearch(int[] arr, int beg, int end, int key) {
        if (end <= beg) {
            return -1;
        }
        int mid = (beg + end) / 2;
        if (arr[mid] < key) {
            binarySearch(arr, mid + 1, end, key);
        } else if (arr[mid] == key) {
            return mid;
        }
        return binarySearch(arr, beg, mid - 1, key);
    }

}
