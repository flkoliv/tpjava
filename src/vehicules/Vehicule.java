package vehicules;

import java.util.List;

import moteurs.Moteur;
import options.Option;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehicule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5561571371271928536L;
	protected Double prix = 0d;
	protected String nom;
	protected Marque nomMarque;
	protected Moteur moteur;
	protected List<Option> options = new ArrayList<Option>();

	public String toString() {
		String str = new String();
		str = "+ Voiture " + nomMarque + " : " + nom + " " + moteur + " ";
		if (options.size() > 0) {
			str = str + "[";
			for (int i = 0; i < options.size(); i++) {
				str = str + options.get(i).toString();
				if (i != (options.size() - 1)) {
					str = str + ", ";
				}
			}
			str = str + "] ";
		} else {
			str = str + "[] ";
		}
		str = str + "pour un prix total de " + prix + "€.";
		return str;
	}

	public void addOption(Option option) {
		options.add(option);
		prix = prix + option.getPrix();

	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
		prix = prix + moteur.getPrix();
	}

	public Marque getMarque() {
		return nomMarque;
	}

	public List<Option> getOptions() {
		return options;
	}

	public Double getPrix() {
		return prix;

	}

}
