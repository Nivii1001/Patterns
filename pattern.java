import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("------------------------");
		for(int i=0;i<num;i++) {
			for(int j=num-i;j>1;j--) {
				System.out.print("-");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		System.out.println("------------------------");
		for(int i=num;i>0;i--) {
			for(int j=num-i;j>0;j--) {
				System.out.print("-");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}



	}

}
