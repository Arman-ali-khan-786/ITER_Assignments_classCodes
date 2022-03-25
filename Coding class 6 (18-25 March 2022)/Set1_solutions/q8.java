import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter array elements :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i=0,j=(n-1);
            while(true){
                while(arr[i]>0)
                    i++;
                while(arr[j]<0)
                    j--;
                if(i>=j)
                    break;
                arr[i] = arr[i]^arr[j];
                arr[j] = arr[i]^arr[j];
                arr[i] = arr[i]^arr[j];
            }
            System.out.println("Array with arranged elements : ");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
      sc.close();
        }
    }
}
