import java.util.Scanner;

//MAIN CLASS
public class CalculatorApp {

	public static void main(String[] args) {
		
		UI.renderMenu();
		boolean run = true;
		while (run == true) {
			
			int a = UI.scanInt();
			int b = UI.scanInt();
			char op = UI.scanOp();
			int r;
		
			if (op == '+') {
				r = Arithmetics.add(a, b);
				UI.renderResult(a, b, op, r);
			}
			else if (op == '-') {
				r = Arithmetics.subb(a, b);
				UI.renderResult(a, b, op, r);
			}
			else if (op == '*') {
				r = Arithmetics.multi(a, b);
				UI.renderResult(a, b, op, r);
			}
			else if (op == '/') {
				r = Arithmetics.div(a, b);
				UI.renderResult(a, b, op, r);
			}
			else {
				System.out.println("The chosen operation is incorrect");
				System.out.println("Allowed operations: +, -, *, /");
			}					
			run = UI.scanRun();
			
		}
	}
}

//SECONDARY CLASSES
class Arithmetics {
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int subb(int a, int b) {
		return a - b;
	}
	
	static int multi(int a, int b) {
		return a * b;
	}
	
	static int div(int a, int b) {
		return a / b;
	}
}

class UI {
	
	static void renderMenu() {
		System.out.println("-------------------------------");
		System.out.println("|          CALCULATOR         |");
		System.out.println("-------------------------------");
		System.out.println("|          Insert numbers     |");
		System.out.println("|          and choose ops:    |");
		System.out.println("|          +, -, *, /         |");
		System.out.println("-------------------------------");	
	}
	
	static int scanInt() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value: ");
		int value = in.nextInt();
		return value;
	}	
	
	static char scanOp() {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose operation (+, -, *, /): ");
		char op = in.next().charAt(0);
		return op;	
	}
	
	static void renderResult(int a, int b, char op, int r) {
		System.out.println(a + " " + op + " " + b + " = " + r);
	}
	
	static boolean scanRun() {
		Scanner in = new Scanner(System.in);
		System.out.println("Another operation (y, n)?: ");
		char run = in.next().charAt(0);
		if (run == 'y') {
			return true;
		}
		else {
			System.out.println("End");
			return false;
		}
	}
}