package Section07;

public class L07_JavaOperators {

	// u main mora da gi stavimo iminja na sve static void shto smo gi napishale za da dobiemo rezultat u konzolu da mozemo da ga ranuemo 
	public static void main(String[]args) {
		
		assigmentOperator();
		arithmicOperator();
		relOperator();
		logical();
		
	}
	
	public static void assigmentOperator() {
		int nbrOne;
		nbrOne = 5;
		
		System.out.println(nbrOne);
	}

	public static void arithmicOperator() {
		int intOne = 2;
		int intTwo = 4;
		int result = 0;
		
		result = intOne + intTwo;
		System.out.println(result);
	}
	
	public static void relOperator() {
		int number1 = 10 ;
		int number2 = 5 ;
		
		if (number1 > number2) {
			System.out.println("number 1 is greater than number 2");
		} else {
			System.out.println("number 2 is greater than number 1");
		}
	
	}
	
	public static void logical() {
		int a = 2;
		int b = 4;
		int c = 10 ;
		boolean resultOne ;
		boolean resultTwo;
		resultOne = (a > b) || ( c > a );
		System.out.println(resultOne);
		
		resultTwo = (a > b) && (c > a );
		System.out.println(resultTwo);
	}
}
