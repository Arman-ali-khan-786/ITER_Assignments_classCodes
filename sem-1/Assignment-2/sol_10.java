public class sol_10 {

	public static void main(String[] args) {
	
		double x1= Double.parseDouble(args[0]);
		double y1= Double.parseDouble(args[1]);
		double x2= Double.parseDouble(args[2]);
		double y2= Double.parseDouble(args[3]);
		double x3= Double.parseDouble(args[4]);
		double y3= Double.parseDouble(args[5]);
		double a=Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
		double b=Math.sqrt(Math.pow((x3-x2), 2)+ Math.pow((y3-y2), 2));
		double c=Math.sqrt(Math.pow((x1-x3), 2)+ Math.pow((y1-y3), 2));
		double s=(a+b+c)/2;
		System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}

}
