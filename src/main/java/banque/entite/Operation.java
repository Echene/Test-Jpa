package banque.entite;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Emmanuel
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Operation {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** date : LocalDateTime */
	@Column(name = "DATE")
	private LocalDateTime date;

	/** montant : double */
	@Column(name = "MONTANT")
	private double montant;

	/** motif : String */
	@Column(name = "MOTIF")
	private String motif;
	
	/** compte : Compte */
	@ManyToOne
	@JoinColumn(name = "ID_COMPTE")
	private Compte compte;

	public Operation() {
		// Constructeur vide
	}
	
	public Operation(double montant, String motif) {
		this.montant = montant;
		this.motif = motif;
	}
	
	public Operation(double montant, String motif, LocalDateTime date) {
		this.montant = montant;
		this.motif = motif;
		this.date = date;
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Getter
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/** Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/** Getter
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Setter
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/** Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/** Setter
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
