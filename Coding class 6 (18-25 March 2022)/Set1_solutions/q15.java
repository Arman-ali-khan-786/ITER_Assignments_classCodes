public class q15 {
    public static void main(String[] args) {
        for(int i =1 ; i<6 ; i++ ){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            for(int k = (63+i) ; k>64 ; k--){
                System.out.print((char)(k));
            }
            System.out.println();
        }
    }
}
