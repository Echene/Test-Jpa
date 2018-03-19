package banque.entite;

import javax.persistence.Embeddable;

/**
 * @author Emmanuel
 *
 */
@Embeddable
public class Adresse {
	
	/** id : int */
	private int id;
	
	/** numero : int */
	private int numero;
	
	/** rue : String */
	private String rue;
	
	/** codePostal : int */
	private int codePostal;
	
	/** ville : String */
	private String ville;
	
	public Adresse() {
		// Constructeur vide
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
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/** Getter
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/** Getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
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
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/** Setter
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/** Setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
