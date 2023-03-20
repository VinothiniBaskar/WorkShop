package basic.java;

public class LearnArithmeticOperations {
	// declare a variables as global
	int a = 60, b = 20;
	// declare a variable for storing results
	int sub, mul, div;

	// Method for Substraction operation
	public void subOperation() {
		sub = a - b;
		System.out.println("Substraction of the numbers is :" + sub);

	}

	// Method for Multiplication operation
	public void mulOperation() {
		mul = a * b;
		System.out.println("Multiplication of the numbers is :" + mul);

	}

	// Method for Divison operation
	public void divOperation() {
		div = a / b;
		System.out.println("Divison of the numbers is :" + div);

	}

	public static void main(String[] args) {
		// create a object for the className
		LearnArithmeticOperations obj = new LearnArithmeticOperations();
		// call the methods using object name
		obj.subOperation();
		obj.mulOperation();
		obj.divOperation();

	}

}
