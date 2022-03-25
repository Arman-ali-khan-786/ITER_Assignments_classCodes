package Set3_solutions;

public class q14 {
    public static void main(String[] args) {
        int arr1[] = {1,4,23,55,6,7,9};
        int arr2[] = {1,2,34,9,4,5};
        int arr3[] = new int[arr2.length];
        int c=0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]){
                    arr3[c++] = arr1[j];
                    
                }
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
