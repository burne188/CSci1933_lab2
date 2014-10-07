import java.util.Scanner;


public class Max2 {

		public int maxDigit2(int num) {
			//Base case of original number
			if(num%10 = num) {
				int max = num
			}
			//If modulo of number isn't number, use recursive call
			else {
				int max = maxDigit2(num%10);
			}
			return max
			}
		
		public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			
			System.out.printf("Please enter Integer: ");
			int num = scan.nextInt();
			
			System.out.println("Max 2: " + maxDigit2(num));
		}
		}


