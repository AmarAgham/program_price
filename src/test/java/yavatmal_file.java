import java.util.Scanner;

public class yavatmal_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int cash = sc.nextInt();
		
		System.out.println("How money you cash");
		if (cash >= 10) {
			System.out.println("you get Only pen");
		}
		else if (cash >= 10 && cash >= 50) {
			System.out.println("You get both ");
			
		}
		else {
			System.out.println("You Need mOre cash");
		}

	}

}
