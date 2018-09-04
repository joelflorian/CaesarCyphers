
public class CaesarCypher {
	//private: otras clases no van a ver esta variable
	//final: ese valor no cambia
	//Static:
	private int key; //todas las instancias van a tener un key, en este caso distinto
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			//Let key=4, then EFGHIJKLM...ZABCD
			
	private static String shiftedAlphabet;
	
	public CaesarCypher (int key){
		this.key = key;
		String leftSubstring = alphabet.substring(0, key);//end index not included in substring
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;
		
		//simbolo de '>' al lado del archivo significa q hice cambios despues del ultimo commit, el
		//archivo esta "Dirty".
		//Commit: Lo guardo en el repositorio local
		//Commit and push: lo guardo en el repositorio local y remoto
		//Staged van a ser grabados cuando haga el push
	}
	
	public String encode(String clearText){
		String cypheredText = "";
		for (int i=0; i < clearText.length(); i++){
			cypheredText += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
		}
		return cypheredText;
	}
}
