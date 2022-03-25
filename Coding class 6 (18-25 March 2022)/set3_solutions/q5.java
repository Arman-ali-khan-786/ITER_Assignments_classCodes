package Set3_solutions;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element x :");
        int x = sc.nextInt();
        String pairs = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]+arr[j] == x){
                    pairs = pairs+"("+arr[i]+","+arr[j]+")"+", ";
                }
            }
        }
        System.out.println("Pairs are : "+pairs);
        sc.close();
    }
}
