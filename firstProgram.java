import java.util.Scanner;

public class firstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scopri se maggiorenne");
		System.out.println("Scrivi la tua data di nascita: ");
		int data = input.nextInt();
		int ok = 2026 - data;
		
		if (ok >= 18) {
			System.out.println("maggiorenne");
		}
		else {
			System.out.println("minorenne");
		}
		

	}

}
