import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println( "Enter the second number: ");
		int num2=sc.nextInt();
		System.out.println("Choose an Operation: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		int choice=sc.nextInt();
	    
		boolean success =true;
		int result =0;
		switch(choice) {
		case 1:
			result=Operation.add(num1, num2);
			break;
		case 2:
			result=Operation.sub(num1,num2);
			break;
		case 3:
			Operation.multiply(num1, num2);
			break;
		case 4:
			if(num2==0) {
				System.out.println("Cannot divide by zero.");
				success=false;
			}
			else {
			result=Operation.div(num1,num2);
			}
			break;
		case 5:
			if(num2==0) {
				System.out.println("cannot modulus by zero.");
				success=false;
			}
			else {
			result=Operation.mod(num1,num2);
			}
		default:
			System.out.println("Invalid choice, please choose from 1 to 5. ");
			break;
		}
		
		if(success) {
			System.out.println("Result: " + result);
		}
	  
		 
		
		sc.close();
		

	}

}
