package bibliotheque.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Emmanuel
 *
 */

@Entity
@Table(name = "client")
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

	@OneToMany(mappedBy="client")
	private List<Emprunt> emprunts;

	public Client() {
		// Constructeur vide
	}

	/**
	 * Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
