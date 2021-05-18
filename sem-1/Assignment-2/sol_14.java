public class sol_14 {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		boolean Res=((a%b==0)||(b%a==0));
		System.out.println("a="+a+"   and  b= "+b);
		System.out.println(Res);
				

	}

}
