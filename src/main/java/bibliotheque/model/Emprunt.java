package bibliotheque.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Emmanuel
 *
 */
@Entity
@Table(name = "emprunt")
public class Emprunt {

	/** id : int */
	@Id
	private int id;

	/** client : Client */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	/** livres : List<Livre> */
	@ManyToMany
	@JoinTable(name = "compo", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Livre> livres;

	/** dateDebut : LocalDate */
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;

	/** dateFin : LocalDate */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;

	@Column(name = "DELAI", length = 10)
	private int delai;

	/**
	 * Constructor
	 */
	public Emprunt() {
		// Constructeur vide
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Getter
	 * 
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Getter
	 * 
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/**
	 * Getter
	 * 
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Setter
	 * 
	 * @param client
	 *            the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Setter
	 * 
	 * @param livres
	 *            the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	/**
	 * Setter
	 * 
	 * @param delai
	 *            the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/** Getter
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

}
