/**
 * 
 */
package moteurs;



/**
 * @author flkol
 *
 */
public class MoteurDiesel extends Moteur  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7479253053740120268L;

	/**
	 * 
	 */

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.DIESEL;
	}

	

}
