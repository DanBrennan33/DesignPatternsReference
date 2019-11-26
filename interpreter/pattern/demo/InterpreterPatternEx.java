package interpreter.pattern.demo;

import java.util.Scanner;

public class InterpreterPatternEx {
	public Context clientContext = null;
	public IExpression exp = null;
	public InterpreterPatternEx(Context c) {
		clientContext = c;
	}
	
	public void interpret(String str) {
		for (int i = 0; i < 2; i++) {
			System.out.print("\nEnter your choice (1 or 2): ");
			Scanner in = new Scanner(System.in);
			String c = in.nextLine();
			if (c.contentEquals("1")) {
				exp = new IntToWords(str);
				exp.interpret(clientContext);
			} else {
				exp = new StringToBinaryExp(str);
				exp.interpret(clientContext);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\n***Interpreter Pattern Demo***\n");
		System.out.print("Enter a number : ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Context context = new Context(input);
		InterpreterPatternEx client = new InterpreterPatternEx(context);
		client.interpret(input);
	}
}
