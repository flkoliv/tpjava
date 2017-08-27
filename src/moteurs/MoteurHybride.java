/**
 * 
 */
package moteurs;

/**
 * @author flkol
 *
 */
public class MoteurHybride extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3596095101085908636L;

	/**
	 * 
	 */

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.HYBRIDE;
	}

}
