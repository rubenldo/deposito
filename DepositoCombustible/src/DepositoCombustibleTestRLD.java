import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTestRLD {
DepositoCombustible comb;

	
	@Before
	public void testValorInicialRLD() {
		comb = new DepositoCombustible(100,25);
	}
	
	@After
	public void TerminarPruebasRLD(){
		comb=null;
	}
	
	@Test
	public void testGetDepositoNivelRLD() {
		assertEquals(25,comb.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMaxRLD() {
		assertEquals(100,comb.getDepositoMax(),0);
	}

	@Test
	public void testDepositoVacioRLD() {
		assertFalse(comb.estaVacio());
	}

	@Test
	public void testDepositoLlenoRLD() {
		assertFalse(comb.estaLleno());
	}

	@Test
	public void testmitadRLD() {
		assertEquals(50,(comb.getDepositoMax()/2),0);
	}

	@Test
	public void testConsumirRLD() {
		assertEquals(25,comb.getDepositoNivel(),0);
	}

}
