/**
 * 
 */
package banque.entite;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Emmanuel
 *
 */
@Entity
public class Client {
	
	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** nom : String */
	@Column(name = "NOM", length = 50)
	private String nom;
	
	/** prenom : String */
	@Column(name = "PRENOM", length = 50)
	private String prenom;
	
	/** dateNaissance : LocalDate */
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@ManyToOne
	@JoinColumn(name = "ID")
	private Banque banque;
	
	@Embedded
	private Adresse adresse;
	
	public Client() {
		// Constructeur vide
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Getter
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/** Getter
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Setter
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
