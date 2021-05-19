import java.util.Scanner;
class Flower{
	String name;int n;double p;
	
	void setData(String m,int l,double k) {
		name=m;
		n=l;
		p=k;
	}
	void getData() {
		System.out.println("Name of the Flower : "+name);
		System.out.println("No of petals : "+n);
		System.out.println("Price : "+p);
	}
}
public class sol_12 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
    Flower a=new Flower();
    Flower b=new Flower();
    System.out.println("1st Folwer info : ");
    String s =sc.nextLine();int g = sc.nextInt();double k=sc.nextDouble();
    a.setData(s,g,k);
    
    System.out.println("2nd  Folwer info : ");
    String e=sc.next();
    int h = sc.nextInt();
    double j=sc.nextDouble();
    b.setData(e,h,j);
    
    a.getData();
    b.getData();

	}

}
