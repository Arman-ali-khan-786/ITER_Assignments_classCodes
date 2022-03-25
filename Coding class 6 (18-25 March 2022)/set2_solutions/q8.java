package Set2_solutions;

public class q8 {
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,6};
        int rotations = 2;    
        for(int i = 1 ; i<=rotations ; i++){
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j]^arr[j+1];
                arr[j+1] = arr[j]^arr[j+1];
                arr[j] = arr[j]^arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
