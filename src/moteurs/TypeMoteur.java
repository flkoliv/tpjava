/**
 * 
 */
package moteurs;

/**
 * @author flkol
 *
 */
public enum TypeMoteur {
	DIESEL("DIESEL"), ESSENCE("ESSENCE"), HYBRIDE("HYBRIDE"), ELECTRIQUE("ELECTRIQUE");

	private String typeMoteur;

	private TypeMoteur(String typeMoteur) {
		this.typeMoteur = typeMoteur;
	}

	public String getTypeMoteur() {
		return this.typeMoteur;
	}
}
