package Set2_solutions;

public class q10 {
    public static void main(String[] args) {
        int arr[] = {322,341,132,134,736};
        int largest1,largest2,largest3;
        largest1 = largest2 = largest3 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest1){
                largest3 = largest2;
                largest2 = largest1;
                largest1 = arr[i];
            }else if(arr[i] > largest2){
                largest3 = largest2;
                largest2 = arr[i];
            }else if(arr[i] > largest3){
                largest3 = arr[i];
            }
        }
        System.out.println("3rd Largest Number : "+largest3);
    }
}
