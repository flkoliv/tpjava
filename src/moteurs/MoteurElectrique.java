/**
 * 
 */
package moteurs;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class MoteurElectrique extends Moteur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7231939678638045449L;

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}

	

}
