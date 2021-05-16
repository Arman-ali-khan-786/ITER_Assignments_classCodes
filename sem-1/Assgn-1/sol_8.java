public class sol_8 {

	public static void main(String[] args) {
		
    int A=565,B=397;
    System.out.println("Before swapping");
    System.out.println("A= " +A);
    System.out.println("B= " +B);
    
    A=A+B;
    B=A-B;
    A=A-B;
    
    System.out.println("After swapping");
    System.out.println("A= " +A);
    System.out.println("B= " +B);
   
	}
}
