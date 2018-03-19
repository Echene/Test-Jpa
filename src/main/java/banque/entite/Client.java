/**
 * 
 */
package banque.entite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@JoinColumn(name = "ID_BANQUE")
	private Banque banque;
	
	/** comptes : List<Compte> */
	@ManyToMany
	@JoinTable(name = "COM_CLI",
			joinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName="ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_COM", referencedColumnName="ID")
	)
	private List<Compte> comptes = new ArrayList<>();
	
	@Embedded
	private Adresse adresse;
	
	public Client() {
		// Constructeur vide
	}
	
	/** Constructor Constructeur sans compte, banque
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Client(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.dateNaissance = LocalDate.now();
	}
	
	/** Constructor Constructeur sans compte
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param banque
	 */
	public Client(String nom, String prenom, Adresse adresse, Banque banque) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.dateNaissance = LocalDate.now();
		this.banque = banque;
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

	/** Getter
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/** Getter
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
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

	/** Setter
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/** Setter
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}
