package banque.entite;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Emmanuel
 *
 */
@Entity
public class Virement extends Operation {

	/** beneficiaire : String */
	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;

	public Virement() {
		// Constructeur vide
	}
	
	public Virement(double montant, String motif, String beneficiaire) {
		super(montant, motif);
		this.beneficiaire = beneficiaire;
	}

	/** Getter
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/** Setter
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
}
