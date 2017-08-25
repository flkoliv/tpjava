/**
 * 
 */
package garage;

import java.util.Scanner;

import moteurs.MoteurDiesel;
import moteurs.MoteurElectrique;
import moteurs.MoteurEssence;
import moteurs.MoteurHybride;
import options.BarreDeToit;
import options.Climatisation;
import options.GPS;
import options.SiegeChauffant;
import options.VitreElectrique;
import vehicules.A300B;
import vehicules.D4;
import vehicules.Lagouna;
import vehicules.Vehicule;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

/**
 * @author flkoliv
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Garage garage = new Garage();
		Scanner sc = new Scanner(System.in);
		
		String str = new String();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			final FileInputStream fichier = new FileInputStream("garage.ser");
			ois = new ObjectInputStream(fichier);
			garage = (Garage) ois.readObject();
		} catch (final java.io.IOException e) {
			//e.printStackTrace();
			System.out.println("Aucune voiture sauvegardée !");
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(garage);
		do {
			System.out.print("Voulez-vous ajouter un véhicule ? (o/n) : ");
			str = sc.nextLine();
			if (str.equals("o")) {
				creerVehicule(garage);
			} else if (str.equals("n")) {
				System.out.println("Au revoir !");
			} else {
				System.out.print("Erreur ! ");
				str = "o";
			}
		} while (str.equals("o"));
		System.out.println(garage.toString());
		try {
			final FileOutputStream fichier = new FileOutputStream("garage.ser");
			oos = new ObjectOutputStream(fichier);
			oos.writeObject(garage);

			oos.flush();
		} catch (final java.io.IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.flush();
					oos.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}
		sc.close();
	}

	private static void creerVehicule(Garage garage) {
		Scanner sc = new Scanner(System.in);
		String str, choix = new String();
		Vehicule vehicule = null;
		String descriptionMoteur = null;
		Double prixMotorisation = 0d;
		Boolean test = true;

		do {
			System.out.print("Modele à ajouter : Lagouna(1) - D4(2) - A300B(3) : ");
			str = sc.nextLine();
			if (!str.equals("1") && !str.equals("2") && !str.equals("3")) {
				System.out.print("Erreur ! ");
			}
		} while (!str.equals("1") && !str.equals("2") && !str.equals("3"));
		switch (str) {
		case "1":
			vehicule = new Lagouna();
			break;
		case "2":
			vehicule = new D4();
			break;
		case "3":
			vehicule = new A300B();
		}
		System.out.println("Type de moteur : ");
		do {
			System.out.print("Essence(1) - Diesel(2) - Hybride(3) - Electrique(4) : ");
			str = sc.nextLine();
			if (!str.equals("1") && !str.equals("2") && !str.equals("3") && !str.equals("4")) {
				System.out.print("Erreur ! ");
			}
		} while (!str.equals("1") && !str.equals("2") && !str.equals("3") && !str.equals("4"));
		choix = str;
		System.out.print("Description du type de moteur : ");
		descriptionMoteur = sc.nextLine();

		do {
			try {
				System.out.print("Prix de la motorisation : ");
				prixMotorisation = sc.nextDouble();
				test = false;
			} catch (Exception e) {
				System.out.print("Erreur ! ");
				sc.nextLine();
			}

		} while (test);

		switch (choix) {
		case "1":
			vehicule.setMoteur(new MoteurEssence(descriptionMoteur, prixMotorisation));
			break;
		case "2":
			vehicule.setMoteur(new MoteurDiesel(descriptionMoteur, prixMotorisation));
			break;
		case "3":
			vehicule.setMoteur(new MoteurHybride(descriptionMoteur, prixMotorisation));
			break;
		case "4":
			vehicule.setMoteur(new MoteurElectrique(descriptionMoteur, prixMotorisation));
		}
		System.out.println("Ajouter une option ?");
		System.out.println("GPS                (1)");
		System.out.println("Barre de toit      (2)");
		System.out.println("Climatisation      (3)");
		System.out.println("Sièges chauffants  (4)");
		System.out.println("Vitres électriques (5)");
		System.out.println("Non                (6)");
		sc.nextLine();
		do {
			System.out.print("Choix Option ? ");
			str = sc.nextLine();
			if (!str.equals("1") && !str.equals("2") && !str.equals("3") && !str.equals("4") && !str.equals("5")
					&& !str.equals("6")) {
				System.out.print("Erreur ! ");
			} else {
				switch (str) {
				case "1":
					vehicule.addOption(new GPS());
					break;
				case "2":
					vehicule.addOption(new BarreDeToit());
					break;
				case "3":
					vehicule.addOption(new Climatisation());
					break;
				case "4":
					vehicule.addOption(new SiegeChauffant());
					break;
				case "5":
					vehicule.addOption(new VitreElectrique());
				}
			}
		} while (!str.equals("6"));

		garage.addVoiture(vehicule);
	}

}
