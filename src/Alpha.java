
public class Alpha {
	public static void main(String[] args){
		Beta betaObject = new Beta();
		betaObject.methodF();
		Beta.methodG();
		Gamma gammaObject = new Gamma();
		gammaObject.methodF();
		Gamma.methodG();
		gammaObject.methodH();
		Delta deltaObject = new Delta();
		deltaObject.PublicMethod();
		/* deltaObject.PrivateMethod();
		Doesn't Work, because it is a private method.
		Can only be called inside of class Delta*/
		Epsilon epsilonObject = new Epsilon(4);
		System.out.println(epsilonObject);
		gammaObject = new Gamma();
		betaObject = new Gamma();
		gammaObject.methodF();
		betaObject.methodF();
		gammaObject.methodH();
		// betaObject.methodH();
		}
}
