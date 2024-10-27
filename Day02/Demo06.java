public class Demo06 {
	public static void main(String[] args) {
		boolean status = true;
		//We cannot convert boolean type into other datatypes
		//int n1 = (int) status; // not possible
		
		//Process of converting narrow type of data into wider type 
		//of data is called widening
		
		int n1 = 10;
		double n2 = n1;
		
		System.out.println("N2 = "+ n2);//Widening
		
		//Process of converting wider type of data into narrower type 
		//of data is called narrowing
		
		double n3 = 12234.231;
		int n4 = (int) n3;
		
		System.out.println("N3 = "+ n4);//Narrowing - Explicit TypeCasting is required
		
		char ch1 = 'H';
		short n5 = (short) ch1; // Type Conversion
		
		System.out.println("n5 = " + n5);
		
	}
	
}