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

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ESSENCE;
	}

	

	

}
