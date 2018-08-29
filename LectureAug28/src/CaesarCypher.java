
public class CaesarCypher {
	//private: otras clases no van a ver esta variable
	//final: ese valor no cambia
	//Static:
	private int key; //todas las instancias van a tener un key, en este caso distinto
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			//Let key=4, then EFGHIJKLM...ZABCD
			
	private static String shiftedAlphabet;
	
	public CaesarCypher (int key){
		this.key = key;
		String leftSubstring = alphabet.substring(0, key);//end index not included in substring
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
		
		//Commit: Lo guardo en el repositorio local
		//Commit and push: lo guardo en el repositorio local y remoto
	}
}
