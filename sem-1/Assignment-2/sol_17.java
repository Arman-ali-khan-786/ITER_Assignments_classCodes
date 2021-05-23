public class a2_q17 {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        boolean s = ((b+c)>=a || (a+c)>=b || (a+b)>=c );
        System.out.println(s);
    }
    
}
