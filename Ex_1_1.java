package human0307;
import java.util.Scanner;
public class Ex_1_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇개를 출력할까요?");
		int a=sc.nextInt();
		
		for(int i=0; i<a; i++) {
			if(i%2 !=0) {
				System.out.print("-");
			}else if(i%2==0) {
				System.out.print("+");
			}
								
		}
		

	}

}
