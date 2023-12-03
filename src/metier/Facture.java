package metier;

import java.time.LocalDate;

public class Facture 
{
	int montant;
	LocalDate date;
	boolean reglee;
	Client clientFacture;
	
	
	public Facture(int montant, boolean reglee, Client clientFacture, LocalDate date) {
		this.date = date;
		this.montant = montant;
		this.reglee = reglee;
		this.clientFacture = clientFacture;
	}
		
		public Facture(int montant, Client clientFacture) {
			this(montant, false, clientFacture, LocalDate.now());
	}
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
		public Client getClient()
		{
			return this.clientFacture;
		}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return reglee ;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		clientFacture.listeFactures.remove(this);
		delete();
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		Facture copieFacture = new Facture(getMontant(), estReglee(), clientFacture, getDate());
		clientFacture.listeFactures.add(copieFacture);
		return copieFacture;
	}
}