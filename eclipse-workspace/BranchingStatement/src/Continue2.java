
public class Continue2 {
	public static void main(String[] args) {
		int s = 24;
		int cnt = 0;
		outer:
		for(int r=1; r<=100; r++) {
			inner:
			for(int c=1; c<=10; c++) {
				int num = r * c;
				if(num == s) {
					cnt++;
					continue outer;
				}
			}
		}
		System.out.println(s + " appears " + cnt + " times.");
	}
}
