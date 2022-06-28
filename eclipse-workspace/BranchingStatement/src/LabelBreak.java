// example of breaking label.
public class LabelBreak {
	public static void main(String[] args) {
		
	label1:
		for(int i=0; i<=5; i++) {
		
		label2:
			for(int j=0; j<=5; j++) {
				if(i == 3 && j == 3) {
					break label1;
				}
				System.out.println(i + " " + j);
			}
			
		}
	}
}
