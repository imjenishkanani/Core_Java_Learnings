// write program to print numbers between 1-100 which are divisible 5 using CONTINUE statement. 
public class Continue {
	public static void main(String[] args) {
		for(int i=1;i<=100; i++)
		{
			if(i%5 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
