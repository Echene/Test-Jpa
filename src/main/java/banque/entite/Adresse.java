package banque.entite;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Emmanuel
 *
 */
@Embeddable
public class Adresse {
	
	/** numero : int */
	@Column(name = "NUMERO")
	private int numero;
	
	/** rue : String */
	@Column(name = "RUE")
	private String rue;
	
	/** codePostal : int */
	@Column(name = "CODEPOSTAL")
	private int codePostal;
	
	/** ville : String */
	@Column(name = "VILLE")
	private String ville;
	
	/** Constructor
	 * 
	 */
	public Adresse() {
		// Constructeur vide
	}
	
	public Adresse(int numero, String rue, int codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
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
