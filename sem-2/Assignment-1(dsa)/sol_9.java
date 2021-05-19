import java.util.*;
class points{
	int x,y;
	void setpoint() {
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}
	double find_distance(points p1,points p2) {
		double dis = Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y), 2));
		return dis;
}
}
public class sol_9 {

	public static void main(String[] args) {
	
    points p1=new points();
    p1.setpoint();
    points p2=new points();
    p2.setpoint();
    points p3=new points();
    double z = p3.find_distance(p1,p2);
    System.out.println("distance = "+z);
	}

}
