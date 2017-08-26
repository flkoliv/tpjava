/**
 * 
 */
package moteurs;


/**
 * @author flkol
 *
 */
public class MoteurEssence extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5254205088974804190L;

	/**
	 * 
	 */

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ESSENCE;
	}

	

	

}
