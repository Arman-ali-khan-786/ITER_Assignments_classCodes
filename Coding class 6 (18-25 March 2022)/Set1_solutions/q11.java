public class q11 {
    public static void main(String[] args) {
        String str = "GOD";
       permute(str , 0 , str.length());
    }

    private static void permute(String str, int l, int r) {
        if(l==r-1){
            System.out.println(str);
            return;
        }
        else{
            for (int i = l; i < r; i++) {
                str=swap(str , l , i);
                permute(str, l+1, r);
                str=swap(str,l,i);
            }
        }
    }

    private static String swap(String str, int a, int b) {
       char str2[] = str.toCharArray();
       char ch;  
       ch = str2[a];  
       str2[a] = str2[b];  
       str2[b] = ch;  
       return String.valueOf(str2);
    }
}
