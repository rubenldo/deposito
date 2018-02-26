import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DepositoLlenarRLD {

	private double para;
	private double res;
	
	public DepositoLlenarRLD (double p, double r) {
		
		para=p;
		res=r;
		
	}
	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object[][] {
			{5.0,5.0},{10.0,10.0},{20.0,20.0},{30.0,30.0},{40.0,40.0}
		});
	}
		
	@Test
	public void testFill() {
	
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(para);
		double nivel=tank.getDepositoNivel();
		assertEquals(res, nivel,0);
	}
	
	
}