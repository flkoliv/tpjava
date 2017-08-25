/**
 * 
 */
package moteurs;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class MoteurHybride extends Moteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3272805197290095745L;

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.HYBRIDE;
	}

	
}
