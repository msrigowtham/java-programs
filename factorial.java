package solutions;
import java.util.Scanner;

public class factorial {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int n=scan.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) {
		 a=i*a;
		}
		System.out.println("the factorial valu is : "+a);
	}

}
