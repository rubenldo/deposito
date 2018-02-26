import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DepositoVaciarRLD {

	private double para;
	private double res;
	
	public DepositoVaciarRLD (double p, double r) {
		
		para=p;
		res=r;
		
	}
	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object[][] {
			{5.0,35.0},{10.0,30.0},{20.0,20.0},{30.0,10.0},{40.0,00.0}
		});
	}
		
	@Test
	public void testFill() {
	
		DepositoCombustible tank = new DepositoCombustible(40.0,40.0);
		tank.consumir(para);
		double nivel=tank.getDepositoNivel();
		assertEquals(res, nivel,0);
	}
	
	
}
