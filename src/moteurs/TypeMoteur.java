/**
 * 
 */
package moteurs;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public enum TypeMoteur implements Serializable{
	DIESEL("DIESEL"),
	ESSENCE("ESSENCE"),
	HYBRIDE("HYBRIDE"),
	ELECTRIQUE("ELECTRIQUE");
	
	private String typeMoteur;
	
	private TypeMoteur(String typeMoteur) {
		this.typeMoteur = typeMoteur;
	}
	
	public String getTypeMoteur() {
		return this.typeMoteur;
	}
}
