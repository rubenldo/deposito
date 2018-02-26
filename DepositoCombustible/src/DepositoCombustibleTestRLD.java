import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTestRLD {
DepositoCombustible comb;

	
	@Before
	public void testValorInicial() {
		comb = new DepositoCombustible(100,25);
	}
	
	@After
	public void TerminarPruebas(){
		comb=null;
	}
	
	@Test
	public void testGetDepositoNivel() {
		assertEquals(25,comb.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		assertEquals(100,comb.getDepositoMax(),0);
	}

	@Test
	public void testDepositoVacio() {
		assertFalse(comb.estaVacio());
	}

	@Test
	public void testDepositoLleno() {
		assertFalse(comb.estaLleno());
	}

	@Test
	public void testmitad() {
		assertEquals(50,(comb.getDepositoMax()/2),0);
	}

	@Test
	public void testConsumir() {
		assertEquals(25,comb.getDepositoNivel(),0);
	}

}
