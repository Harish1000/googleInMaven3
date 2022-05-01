import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

interface CalculatorFace{
	public int calculate(int operand1,int operand2,String operator); 
		
}

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter input 1: ");
		int op1=scan.nextInt();
		System.out.print("Enter input 2: ");
		int op2=scan.nextInt();
		System.out.print("Enter operator: ");
		String opr=scan.next();
		int result=0;
		if(opr.equals("+")) {
			CalculatorFace add=(operand1,operand2,operator)->(operand1+operand2);
			result=performCalculation(op1,op2,opr,add);
		}
		if(opr.equals("-")) {
			CalculatorFace subtraction=(operand1,operand2,operator)->(operand1-operand2);
			result=performCalculation(op1,op2,opr,subtraction);
		}
		if(opr.equals("*")) {
			CalculatorFace mul=(operand1,operand2,operator)->(operand1*operand2);
			result=performCalculation(op1,op2,opr,mul);
		}
		if(opr.equals("/")) {
			CalculatorFace div=(operand1,operand2,operator)->(operand1/operand2);
			result=performCalculation(op1,op2,opr,div);
		}
		System.out.println("Result: "+result);
	}
	public static int performCalculation(int operand1,int operand2,String operator,CalculatorFace calculator) {
		return calculator.calculate(operand1, operand2, operator);
	}

}
