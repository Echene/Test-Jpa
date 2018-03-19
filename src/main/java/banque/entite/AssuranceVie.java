package banque.entite;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Emmanuel
 *
 */
@Entity
public class AssuranceVie extends Compte {

	/** taux : double */
	@Column(name = "TAUX")
	private double taux;

	/** dateFin : LocalDate */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;

	public AssuranceVie() {
		// Constructeur vide
	}
	
	public AssuranceVie(double taux, LocalDate dateFin) {
		this.taux = taux;
		this.dateFin = dateFin;
	}

	/** Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
}
