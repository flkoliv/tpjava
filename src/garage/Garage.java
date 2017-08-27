package garage;

import java.util.ArrayList;
import java.util.List;

import vehicules.Vehicule;

import java.io.Serializable;

public class Garage implements Serializable {

	/**
	 * 
	 *
	 * 
	 */
	private static final long serialVersionUID = 1854601209120177557L;
	private List<Vehicule> voitures = new ArrayList<Vehicule>();

	public void add(Vehicule voit) {
		voitures.add(voit);

	}

	public String toString() {
		String str = new String();
		str =  "***************************\n";
		str += "*  Garage Openclassrooms  *\n";
		str += "***************************\n";

		if (voitures.size() > 0) {
			for (int i = 0; i < voitures.size(); i++) {
				str = str + voitures.get(i).toString();
				if (i != (voitures.size() - 1)) {
					str = str + "\n";
				}
			}
		} else {
			str = str + "Le garage est vide";
		}

		return str;
	}

	public void addVoiture(Vehicule voit) {
		voitures.add(voit);

	}
}
