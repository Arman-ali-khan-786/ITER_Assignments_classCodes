package set4_solutions;

public class q4 {
    public static void main(String[] args) {
        int n = 10;
        String str = "";
        int i=2;
        while(n>1){
            if(n % i == 0){
                str=str+i+",";
                n/=i;
            }else{
                i++;
            }
        }
        System.out.println(str);
    }
}
