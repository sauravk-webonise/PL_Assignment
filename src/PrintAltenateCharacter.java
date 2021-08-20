import java.util.Scanner;

class A{

	public void printAlternate(String input) {
		int count;
		String result = "";

		count  = input.length();
		System.out.println(input);

		do{
			for(int i=0; i<input.length(); i = i+2) {
				result  += input.charAt(i);
			}
			System.out.println(result);
			input  = result;
			result = "";
			count  = count/2;

		}while(count >= 1);

	}

}

public class PrintAltenateCharacter {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		A obj = new A();
		obj.printAlternate(input);
		sc.close();

	}
}	
