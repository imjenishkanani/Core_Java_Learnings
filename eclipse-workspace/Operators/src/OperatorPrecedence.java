
public class OperatorPrecedence {
	public static void main(String[] args) {
		int a = 100;
		a = --a + a++ + a-- + a++;
		System.out.println("a = " + a);
		
		a = 1;
		a = -a-- + a++ / -a-- * --a;
		System.out.println("a = " + a);
	}
}
