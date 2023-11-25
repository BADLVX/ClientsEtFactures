package metier;

import java.util.ArrayList;
import java.util.List;

public class Client 
{
	int num;
	String nom;
	static ArrayList<Client> listeClients = new ArrayList<>();
	ArrayList<Facture> listeFactures = new ArrayList<>();
	
	public Client(String nom)
	{
		this.nom = nom;
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	public String getNom() {
		return nom;
	}
	
	/*public static int getIndice(String nom)
	{
		for(int i=0;i<listeClients.size();i++) {
			if(listeClients(i).getNom().compareTo(nom) == true)
				return i; }
		return -1;
	}*/
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant)
	{
		Facture facture = new Facture(montant);
		listeFactures.add(facture);
		return facture;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		return listeFactures;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int somme = 0;
		for(int i=1; i <= listeFactures.size(); i++) {
			Facture facture = listeFactures.get(i);
			 int montant = facture.getMontant();
			 somme += montant;
		}
		return somme;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		return new Facture(montant, reglee);
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		ArrayList<Facture> listeFacturesReglee = new ArrayList<>();

		for(int i=1; i <= listeFactures.size(); i++) {
			Facture facture = listeFactures.get(i);
			if (facture.estReglee() == true)
				listeFacturesReglee.add(listeFactures.get(i));
		}
		
		return listeFacturesReglee;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		ArrayList<Client> listeClientsCopie = new ArrayList<Client>(listeClients);
		return listeClientsCopie;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
		listeClients.remove(num);
	}
}
