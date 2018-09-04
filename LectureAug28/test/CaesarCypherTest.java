import junit.framework.TestCase;


public class CaesarCypherTest extends TestCase {
	
	void testEncode(){
		CaesarCypher c = new CaesarCypher(3);
		assertEquals("KHOOR", c.encode("HELLO")); // Le paso dos objetos y los compara. Si mis objetos
												//no son iguales entonces falla la prueba
		
	}
}
