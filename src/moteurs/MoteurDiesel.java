/**
 * 
 */
package moteurs;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class MoteurDiesel extends Moteur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2656587172880753072L;

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.DIESEL;
	}

	

}
