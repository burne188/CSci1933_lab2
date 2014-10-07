import java.util.Scanner;

//burne188 and hanzl034 worked together
public class Rational {
	
	private int numerator = 0;
	private int denominator = 0;
	
	public Rational(int a, int b) {
		numerator = a;
		denominator = b;	
	}
	
	public void setNumerator(int value) {
		numerator = value;
	}
	
	public void setDenominator(int value) {
		denominator = value;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void addRational(Rational c) {
		// must first find greatest common denominator
		numerator = (c.getDenominator() * numerator) + (denominator * c.getNumerator());
		denominator = c.getDenominator() * denominator;
	}
	
	public void subRational(Rational d) {
		numerator = (d.getDenominator() * numerator) - (denominator * d.getNumerator());
		denominator = d.getDenominator() * denominator;
		
	}
	
	public void mulRational(Rational e) {
		denominator = denominator * e.getDenominator();
		numerator = numerator * e.getNumerator();
	}
	
	public void divRational(Rational f) {
		denominator = denominator * f.getNumerator();
		numerator = numerator * f.getDenominator();
	}
	
	public void setRational() {
		Scanner scan = new Scanner(System.in);
		setRational(scan);
	}
	//Sets the numerator and denominator using the scanner class
	public void setRaional(Scanner scan) {
		System.out.printf("Enter numerator: ");
		setNumerator(scan.nextInt());
		System.out.printf("Enter denominator: ");
		setDenominator(scan.nextInt());
	}
	
	public static void main (String[] args) {
		int numerator = Integer.parseInt(args[0]);
		int denominator = Integer.parseInt(args[1]);
		
		Rational rat1 = new Rational(numerator, denominator);
		System.out.printf("Numerator: %d\n", rat1.getNumerator());
		System.out.printf("Denominator: %d\n", rat1.getDenominator());
		
		if(args.length > 2)
		{
			int num2 = Integer.parseInt(args[3]);
			int den2 = Integer.parseInt(args[4]);
			Rational rat2 = new Rational(num2,den2);
			System.out.printf("2nd Numerator: %d\n", rat2.getNumerator());
			System.out.printf("2nd Denominator: %d\n", rat2.getDenominator());
			if(args[2].equals("add"))
			{
				rat1.addRational(rat2);
				
			}
			else if(args[2].equals("subtract"))
			{
				rat1.subRational(rat2);
				
			}
			else if(args[2].equals("multiply"))
			{
				rat1.mulRational(rat2);
			}
			else if(args[2].equals("divide"))
			{
				rat1.divRational(rat2);
			}
			System.out.print("After transformations\n");
			System.out.printf("Numerator: %d\n", rat1.getNumerator());
			System.out.printf("Denominator: %d\n", rat1.getDenominator());
				
		}
	}//Rational class takes in two numbers as a numerator and denominator
	//The methods can add, subtract, multiply, and divide the rational numbers
	//The main method prints the numerator, denominator, and any transformations in the console
	//Flaws: can only accept integers gracefully
}
