
public class reverse2 {

	public static int Reverse(int n) {
		int revnum = 0;
		
		//Takes an integer and stores it
		//Takes the first digit in that integer and stores it separately
		//Places that digit at the end of the integer and so on until all of the integers are moved
		
		while(n>0) {
			revnum *= 10;
			revnum += n%10;
			n /= 10;
		}
		
		return revnum;
	}
	
	
	public static int Reverse2(int num) {
		int revnum = 0;
		int temp = 1;
		int n = 0;
		
		//Takes in an integer and stores it
		//Uses and single digit integers as base case
		//Recursivle calls Reverse2 to cycle through the rest of the digits to reverse them
		
		if(num < 10) {
			revnum = num;
		}
		else {
			revnum = Reverse2(num/10);
			
			while(revnum > 0) {
				temp *= 10;
				n /= 10;
			}
		}
		return num%10 * temp + revnum;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Enter an integer: ");
		int num = scan.nextInt();
		
		System.out.println("Reverse 1: " + Reverse(num));
		System.out.println("Reverse 2: " + Reverse2(num));
	}
}
