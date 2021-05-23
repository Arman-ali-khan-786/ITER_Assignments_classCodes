public class sol_19 {
    public static void main(String[] args) {
        int basicSal = Integer.parseInt(args[0]);
        int DA = basicSal * (0.4);
        int HRA = basicSal * (0.2);
        System.out.println("Gross Salary : "+(basicSal+DA+HRA));
    }
    
}
