public class Demo07{
	public static void main(String[] args) {
		int n1 = 65;
		char ch = (char) n1; 
		
		System.out.println("CH = " + ch);// A
		
		char ch2 = 'h';
		int n2 = ch2; 
		
		System.out.println("N2 = " + n2 );// 105
		
		double n3 = ch2;
		
		System.out.println("N3 = " +n3 ); // 105.0
		
		double n4 = 105.36;
		char ch3 = (char) n4;
		
		System.out.println("ch3 = " + ch3);
	}
}