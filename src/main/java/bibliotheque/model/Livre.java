package bibliotheque.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Emmanuel
 *
 */
@Entity
@Table(name = "livre")
public class Livre {

	/** id : int */
	@Id
	private int id;
	
	/** titre : String */
	@Column(name = "TITRE", length = 255)
	private String titre;
	
	/** auteur : String */
	@Column(name = "AUTEUR", length = 50)
	private String auteur;
	
	/** emprunts : List<Emprunt> */
	@ManyToMany(mappedBy="livres")
	private List<Emprunt> emprunts;

	/** Constructor
	 * 
	 */
	public Livre() {
		// Constructeur vide
	}
	
	@Override
	public String toString() {
		return "Livre " + id + "\n   Titre : " + titre + "\n   Auteur : " + auteur;
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Getter
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/** Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/** Getter
	 * @return the emprunts
	 */
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	/** Setter
	 * @param emprunts the emprunts to set
	 */
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

}
