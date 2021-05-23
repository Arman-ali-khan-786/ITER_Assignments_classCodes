public class sol_21 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        t=Math.toRadians(t);
        double sum = Math.sin(t) + Math.cos(t);
        System.out.println(" Value = "+sum);
    }
}
