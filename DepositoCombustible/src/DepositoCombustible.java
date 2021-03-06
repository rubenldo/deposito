/**
 * DepositoCombustible es una clase que representa el dep贸sito de gasolina de un coche
 * Un objeto DepositoCombustible agrupa la informaci贸n necesaria para describir el estado del dep贸sito:
 * <ul>
 *   <li> depMax   capacidad del dep贸sito
 *   <li> depNivel	nivel de gasolina del dep硈ito
 * </ul>
 * 
 * class invariante 		0.0 &lt;= depNivel &lt;= depMax
 * 
 * @author IES Seveero Ochoa Team
 * @version 1.0
 *
 */
public class DepositoCombustible {

    private double depMax;
    private double depNivel;

   /**
	* DepositoCombustible es el constructor de la clase. 
	* 
	* <hr>
	* <br> precondici贸n  depMax &gt; 0.0 and 0.0 &lt;= depNivel &lt;= getTankMax()  
	* <br> postcondici贸n depMax &gt; 0.0 and 0.0 &lt;= depNivel &lt;= getTankMax() 
	* <hr>
	* 
	* @param tankMax  es la cantidad de combustible (medida en litros) que cabe en el dep贸sito
	* @param tankLevel es la cantidad de combustible (medida en litros) que contiene el dep贸sitohffghf inicialmente
	* 
	*/ 
	DepositoCombustible(double tankMax, double tankLevel) {
       this.depMax   = tankMax;
       this.depNivel = tankLevel;
    }

   /**
    * getDepositoNivel es un m茅todo para obtener informaci贸n
    * 
    * @return	la cantidad de combustible en el dep贸sito
    */
    public double getDepositoNivel(){
       return depNivel;
    }

   /**
    * getDepositoMax es un m茅todo para obtener informaci贸n
    * 
    * @return	la capacidad (en litros) del dep贸sito
	*/
	public double getDepositoMax(){
       return depMax;
    }

   /**
	* estaVacio da informaci贸n del estado 
	* 
	* @return 	<code>true</code> si el dep贸sito est谩 vacio 
    *          <code>false</code> en otro caso.
	*/
    public boolean estaVacio(){
      return depNivel == 0;
    }

    /**
	 * estaLleno informaci贸n del estado 
	 * 
	 * @return 	<code>true</code> si el dep贸sito est谩 lleno 
     *          <code>false</code> en otro caso.
	 */
    public boolean estaLleno(){
	  return depNivel == depMax;
    }

   /**
	* llenar es un m茅todo que efect煤a cambios a帽adiendo combustible al dep贸sito
	* 
	* <hr>
	* <br> precondicion 	0.0 &lt; amount &lt;= getDepositoMax() - getDepositoNivel() 
	* <br> postcondicion 	no vacio
	* <br> postcondicion  	depNivel &gt; depNivel_inicial 
	* <hr>
	* 
	* @param amount 	Cantidad de combustible que a帽ade
	* 
	*/
    public void fill(double amount){
       depNivel = depNivel + amount;
    }

   /**
	* consumir es un m茅todo que efectua cambios reduciendo el combustible del dep贸sito
	* 
    * @param amount cantidad de fuel consumida
    * 
    */
	public void consumir(double amount){
       depNivel = depNivel - amount;
    }
}
