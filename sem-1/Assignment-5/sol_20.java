import sjava.util.*;
public class sol_20{
  public static void main(String[] ags){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 2 ;
    while(n/i!=1){
      if(n%i == 0 ){
        System.out.print(i+", ");
        n/=i;
      }
      else{
        i++;
      }
    }
    System.out.println(n+".");
    sc.close();
  }
}
