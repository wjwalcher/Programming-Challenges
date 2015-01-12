
public class ROR {
	public static void main(String[] args){
		final Integer x = returnsInteger();
		System.out.println(x);
		System.out.println(returnsString());
		AuxillaryC auxObject = new AuxillaryC();
		final double d = auxObject.returnsDouble();
		System.out.println(d);
		
		if(auxObject.returnsBoolean()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static Integer returnsInteger(){
		return 9;
	}
	public static String returnsString(){
		return "It doesn't do anything Will! When will you learn!?!";
	}
}
 