package solutions;
import java.util.*;
public class greatedestnum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter secont number");
		int b=scan.nextInt();
		System.out.println("enter theart number");
		int c=scan.nextInt();
			if(a>b) {
				if(a>c) {
					System.out.println(a);
				}
			}
			if(b>a) {
				if(b>c) {
					System.out.println(b);
				}
		}
	   if(c>a){
		   if(c>b) {
			   System.out.println(c);
		   }
		   
	   }
	}

}
