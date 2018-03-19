package banque.entite;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Emmanuel
 *
 */
@Entity
public class LivretA extends Compte{

	/** taux : double */
	@Column(name = "TAUX")
	private double taux;
	
	public LivretA() {
		// Constructeur vide
	}
	
	public LivretA(int numero, Double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}

	/** Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
