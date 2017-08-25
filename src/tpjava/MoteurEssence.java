/**
 * 
 */
package tpjava;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class MoteurEssence extends Moteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5822078789751813508L;

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ESSENCE;
	}

	

	

}
