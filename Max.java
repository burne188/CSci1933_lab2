
public class Max {
	
	public static int maxDigit(int a) {
		int max = 0;
		int temp = 0;
		//Takes an integer and stores it
		//Searches through integer using % and / and stores those values
		//Compares those values to eachother and returns the largest value
		while (a > 0) {
			temp = a%10;
			
			if (temp > max) {
				max = temp;
			}
				max = a/10;
		} 
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Enter and Integer: ");
		int num = scan.nextInt();
		
		System.out.println("Max 1:" + maxDigit(num));
		
	}

}
