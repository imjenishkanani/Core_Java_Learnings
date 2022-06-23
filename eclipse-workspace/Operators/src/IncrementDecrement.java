
public class IncrementDecrement {
	public static void main(String[] args) {
		int i=10, j=5;
		i++; j--;
		System.out.println(i);
		System.out.println(j);
		
		int res = i++ + --j;
		System.out.println(res);
		System.out.println(i);
		System.out.println(j);
	}
}
