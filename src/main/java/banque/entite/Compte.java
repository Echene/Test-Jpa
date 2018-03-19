package banque.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author Emmanuel
 *
 */
@Entity
public class Compte {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** numero : int */
	@Column(name = "NUMERO")
	private int numero;

	/** solde : double */
	@Column(name = "SOLDE")
	private double solde;
	
	/** operations : List<Operation> */
	@OneToMany(mappedBy = "compte")
	private List<Operation> operations = new ArrayList<>();
	
	/** clients : List<Client> */
	@ManyToMany
	@JoinTable(name = "COM_CLI",
			joinColumns = @JoinColumn(name = "ID_COM", referencedColumnName="ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName="ID")
	)
	private List<Client> clients = new ArrayList<>();

	/**
	 * Constructor
	 * 
	 */
	public Compte() {
		// Constructeur vide
	}
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Getter
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/** Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Getter
	 * @return the operations
	 */
	public List<Operation> getOperations() {
		return operations;
	}

	/** Getter
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Setter
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	/** Setter
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
