
public class Demo09 {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		
		//Process of converting Refrence type into value type
		// is called unboxing...
		
		int n1 = i1.intValue(); // unboxing
		
		// If the conversion between the refrence type
		// to value type is done automatically
		// then it is called as Auto-unboxing
		
		int n2 = i1; // Auto-unboxing
		
		System.out.println("Hola..");

	}

}
