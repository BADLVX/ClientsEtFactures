package metier;

import java.time.LocalDate;

public class Facture 
{
	int montant;
	static LocalDate date;
	boolean reglee;
	Client clientFacture;
	
	
	public Facture(int montant, boolean regleee, Client clientFacture) {
		this.montant = montant;
		this.reglee = reglee;
		this.clientFacture = clientFacture;
	}
		
		public Facture(int montant, Client clientFact) {
			this(montant, false, clientFact);
	}
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
		public Client getClient()
		{
			return this;
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
		new Facture(montant, reglee);
		return (reglee == true) ? true : false;
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
		Facture Facture = new Facture(0, false);
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return new Facture(getMontant(), estReglee());
	}
}