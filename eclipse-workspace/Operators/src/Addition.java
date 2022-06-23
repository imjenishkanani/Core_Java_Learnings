
public class Addition {
	public static void main(String [] args) {
				int i1 = 5;
				int i2 = 10;
				float f1 = 15.5f;
				double d1 = 20.5;
				String msg = "HELLO ";
				int res1 = i1 + i2;
				float res2 = i1 + f1; 
				double res3 = i2 + d1; 
				String res4 = msg + f1; 
				
				System.out.println("res1 = " + res1);
				System.out.println("res2 = " + res2);
				System.out.println("res3 = " + res3);
				System.out.println("res4 = " + res4);
				
				System.out.println("----------------------------------------");
				
				byte b1 = 12; 
				byte b2 = 20; 
				
				byte res5 = (byte) (b1 + b2); 
				byte res6 = (byte) (b1 + 0); 
				byte res7 = 126 + 1; 
				byte res8 = (byte) (126 + 19); 
				
				System.out.println("res5 = " + res5);
				System.out.println("res6 = " + res6);
				System.out.println("res7 = " + res7);
				System.out.println("res8 = " + res8);
	}
}
